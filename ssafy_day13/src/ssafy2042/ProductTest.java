package ssafy2042;

public class ProductTest {

    public static void main(String[] args) {
        // ProductManager 인스턴스 생성
        ProductManager manager = new ProductManager();

        // 상품 추가 테스트
        Product product1 = new Product("P001", "Smartphone", 1000000, 50, "Samsung", "High-end smartphone");
        Product product2 = new Product("P002", "Laptop", 1500000, 30, "LG", "Lightweight laptop");
        Product product3 = new Product("P003", "TV", 2000000, 20, "Sony", "4K Ultra HD TV");

        manager.addProduct(product1);
        manager.addProduct(product2);
        manager.addProduct(product3);

        // 상품 리스트 출력
        System.out.println("=== Product List ===");
        for (Product product : manager.getProductList()) {
            System.out.println(product);
        }

        // 상품 수정 테스트
        Product updatedProduct = new Product("P002", "Gaming Laptop", 1700000, 25, "LG", "High-performance gaming laptop");
        manager.updateProduct(product2, updatedProduct);

        System.out.println("\n=== Updated Product List ===");
        for (Product product : manager.getProductList()) {
            System.out.println(product);
        }

        // 상품 판매 테스트
        System.out.println("\n=== Sell Product ===");
        boolean sold = manager.sell("P001", 5);
        if (sold) {
            System.out.println("Product P001 sold. Remaining quantity: " + manager.searchByCode("P001").getQuantity());
        } else {
            System.out.println("Failed to sell product P001.");
        }

        // 리뷰 추가 테스트
        Review review1 = new Review(1, "P001", "Alice", "Great smartphone with excellent features.");
        Review review2 = new Review(2, "P002", "Bob", "Good laptop for everyday use.");
        Review review3 = new Review(3, "P003", "Charlie", "Amazing picture quality on this TV.");

        manager.addReview(review1);
        manager.addReview(review2);
        manager.addReview(review3);

        // 특정 상품 리뷰 출력
        System.out.println("\n=== Reviews for P001 ===");
        for (Review review : manager.getProductReview()) {
            if (review.getPCode().equals("P001")) {
                System.out.println(review);
            }
        }

        // 리뷰 삭제 테스트
        System.out.println("\n=== Remove Review ===");
        boolean reviewRemoved = manager.removeReview(1);
        if (reviewRemoved) {
            System.out.println("Review 1 removed.");
        } else {
            System.out.println("Failed to remove review 1.");
        }

        // 리뷰 삭제 후 리스트 출력
        System.out.println("\n=== Updated Reviews ===");
        for (Review review : manager.getProductReview()) {
            System.out.println(review);
        }

        // 상품 삭제 테스트
        System.out.println("\n=== Remove Product ===");
        boolean productRemoved = manager.removeProduct("P003");
        if (productRemoved) {
            System.out.println("Product P003 removed.");
        } else {
            System.out.println("Failed to remove product P003.");
        }

        // 상품 삭제 후 리스트 출력
        System.out.println("\n=== Updated Product List ===");
        for (Product product : manager.getProductList()) {
            System.out.println(product);
        }
    }
}
