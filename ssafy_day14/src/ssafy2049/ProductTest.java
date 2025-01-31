package ssafy2049;

public class ProductTest {

    public static void main(String[] args) {
        // ProductManager 인스턴스 생성
        ProductManager manager = new ProductManager();

        // 상품 추가 테스트 (냉장고 포함)
        Product product1 = new Product("P001", "Smartphone", 1000000, 50, "Samsung", "High-end smartphone");
        Product product2 = new Product("P002", "Washing Machine", 800000, 20, "LG", "Front-load washing machine");
        Product product3 = new Product("P003", "TV", 2000000, 20, "Sony", "4K Ultra HD TV");
        Refrigerator refrigerator1 = new Refrigerator("R001", "Samsung Refrigerator", 1200000, 15, "Samsung", "Large double-door refrigerator", "Home Appliance", 500, true, 2023);
        Refrigerator refrigerator2 = new Refrigerator("R002", "LG Mini Fridge", 600000, 10, "LG", "Compact fridge for small spaces", "Home Appliance", 150, false, 2022);

        manager.addProduct(product1);
        manager.addProduct(product2);
        manager.addProduct(product3);
        manager.addProduct(refrigerator1);
        manager.addProduct(refrigerator2);

        // 상품 리스트 출력
        System.out.println("=== Product List ===");
        for (Product product : manager.getProductList()) {
            System.out.println(product);
        }

        // 상품 수정 테스트
        Product updatedProduct = new Product("P002", "Premium Washing Machine", 900000, 18, "LG", "Smart washing machine with Wi-Fi support");
        manager.updateProduct(product2, updatedProduct);

        System.out.println("\n=== Updated Product List ===");
        for (Product product : manager.getProductList()) {
            System.out.println(product);
        }

        // 상품 판매 테스트
        System.out.println("\n=== Sell Product ===");
        boolean sold = manager.sell("R001", 2);
        if (sold) {
            System.out.println("Product R001 sold. Remaining quantity: " + manager.searchByCode("R001").getQuantity());
        } else {
            System.out.println("Failed to sell product R001.");
        }

        // 리뷰 추가 테스트 (냉장고 포함)
        Review review1 = new Review(1, "P001", "Alice", "Great smartphone with excellent battery life.");
        Review review2 = new Review(2, "P002", "Bob", "Washes clothes quickly and efficiently.");
        Review review3 = new Review(3, "P003", "Charlie", "Amazing picture quality on this TV.");
        Review review4 = new Review(4, "R001", "David", "Spacious and keeps food fresh for a long time.");
        Review review5 = new Review(5, "R002", "Emma", "Perfect size for a dorm room!");

        manager.addReview(review1);
        manager.addReview(review2);
        manager.addReview(review3);
        manager.addReview(review4);
        manager.addReview(review5);

        // 특정 상품 리뷰 출력 (냉장고 리뷰 포함)
        System.out.println("\n=== Reviews for R001 ===");
        for (Review review : manager.getProductReview()) {
            if (review.getPCode().equals("R001")) {
                System.out.println(review);
            }
        }

        // 리뷰 삭제 테스트
        System.out.println("\n=== Remove Review ===");
        boolean reviewRemoved = manager.removeReview(4);
        if (reviewRemoved) {
            System.out.println("Review 4 removed.");
        } else {
            System.out.println("Failed to remove review 4.");
        }

        // 리뷰 삭제 후 리스트 출력
        System.out.println("\n=== Updated Reviews ===");
        for (Review review : manager.getProductReview()) {
            System.out.println(review);
        }

        // 상품 삭제 테스트
        System.out.println("\n=== Remove Product ===");
        boolean productRemoved = manager.removeProduct("R002");
        if (productRemoved) {
            System.out.println("Product R002 removed.");
        } else {
            System.out.println("Failed to remove product R002.");
        }

        // 상품 삭제 후 리스트 출력
        System.out.println("\n=== Updated Product List ===");
        for (Product product : manager.getProductList()) {
            System.out.println(product);
        }
    }
}
