package ssafy2046;

public class RestaurantTest {
    public static void main(String[] args) {
        RestaurantManager manager = new RestaurantManager();

        // 맛집 추가
        manager.addRestaurant(new Restaurant(1, "맛있는집", "서울 강남", "김치찌개", 5));
        manager.addRestaurant(new Restaurant(2, "고기맛집", "부산 해운대", "삼겹살", 4));

        // 맛집 조회
        for (Restaurant res : manager.getRestaurantList()) {
            System.out.println(res);
        }

        // 리뷰 추가
        manager.addReview(new Review(1, 1, "홍길동", "정말 맛있어요!"));
        manager.addReview(new Review(2, 1, "김철수", "괜찮아요."));

        // 리뷰 조회
        for (Review review : manager.getRestaurantReview(1)) {
            System.out.println(review);
        }

        // 맛집 수정
        manager.updateRestaurant(new Restaurant(1, "맛있는집", "서울 강남", "김치찌개", 3));

        // 맛집 삭제
        manager.removeRestaurant(2);
    }
}
