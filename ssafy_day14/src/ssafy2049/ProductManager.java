package ssafy2049;

public class ProductManager {

	final int MaxProductSize = 100;
	final int MaxReviewSize = 1000;
	Product[] products = new Product[MaxProductSize];
	Review[] reviews = new Review[MaxReviewSize];
	int pCount = 0;
	int rCount = 0;

	boolean addProduct(Product product) {
		if (pCount < MaxProductSize) {
			products[pCount++] = product;
			return true;
		} else {
			return false;
		}
	}

	boolean addReview(Review review) {
		if (rCount < MaxReviewSize) {
			reviews[rCount++] = review;
			return true;
		} else {
			return false;
		}
	}

	boolean updateProduct(Product product1, Product product2) {
		for (int i = 0; i < pCount; i++) {
			if (product1.getpCode().equals(product2.getpCode())) {
				product1.setpCode(product2.getpCode());
				product1.setpName(product2.getpName());
				product1.setPrice(product2.getPrice());
				product1.setQuantity(product2.getQuantity());
				product1.setBrand(product2.getBrand());
				product1.setDesc(product2.getDesc());
				return true;
			}
		}
		return false;
	}

	Product[] getProductList() {
		Product[] result = new Product[pCount];
		for (int i = 0; i < pCount; i++) {
			result[i] = products[i];
		}
		return result;
	}
	
	Review[] getProductReview() {
		Review[] result = new Review[rCount];
		for (int i = 0; i < rCount; i++) {
			result[i] = reviews[i];
		}
		return result;
	}

	boolean sell(String pCode, int count) {
		for (int i = 0; i < pCount; i++) {
			if (products[i].getpCode().equals(pCode)) {
				int result = products[i].getQuantity() - count;
				if (result >= 0) {
					products[i].setQuantity(result);
					return true;
				} else {
					return false;
				}

			}
		}
		return false;
	}

	Product searchByCode(String pCode) {
		for (int i = 0; i < pCount; i++) {
			if (products[i].getpCode().equals(pCode)) {
				return products[i];
			}
		}
		return null;
	}

	boolean removeProduct(String pCode) {
		for (int i = 0; i < pCount; i++) {
			if (products[i].getpCode().equals(pCode)) {
				products[i] = null;
				for (int j = i; j < pCount; j++) {
					products[j] = products[j + 1];
				}
				pCount++;
				return true;
			}
		}
		return false;
	}

	boolean removeReview(int reviewId) {
		for (int i = 0; i < rCount; i++) {
			if (reviews[i].getReviewId() == reviewId) {
				reviews[i] = null;
				for (int j = i; j < rCount; j++) {
					reviews[j] = reviews[j + 1];
				}
				rCount--;
				return true;
			}
		}
		return false;
	}
	
	Product[] getProduct() {
		int count = 0;
		int idx = 0;
		for (int i = 0; i < products.length;i++) {
			if (!(products[i] instanceof Refrigerator)) {
				count++;
			}
		}
		Product[] result = new Product[count];
		for (int i = 0; i < products.length; i++) {
			if (!(products[i] instanceof Refrigerator)) {
				result[idx++] = products[i];
			}
		}
		return result;
	}
	
	Product[] getRefrigerator() {
		int count = 0;
		int idx = 0;
		for (int i = 0; i < products.length;i++) {
			if (products[i] instanceof Refrigerator) {
				count++;
			}
		}
		Product[] result = new Product[count];
		for (int i = 0; i < products.length; i++) {
			if (products[i] instanceof Refrigerator) {
				result[idx++] = products[i];
			}
		}
		return result;
	}
	
	Product[] getRefrigeratorFreezer(boolean freezer) {
		int count = 0;
		int idx = 0;
		for (int i = 0; i < products.length;i++) {
			if (products[i] instanceof Refrigerator && ((Refrigerator)products[i]).isFreezer() == freezer) {
				count++;
			}
		}
		Product[] result = new Product[count];
		for (int i = 0; i < products.length; i++) {
			if (products[i] instanceof Refrigerator && ((Refrigerator)products[i]).isFreezer() == freezer) {
				result[idx++] = products[i];
			}
		}
		return result;

	}

}
