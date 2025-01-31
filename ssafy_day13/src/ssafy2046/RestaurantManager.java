package ssafy2046;

public class RestaurantManager {
    private static final int MAX_RESTAURANT_SIZE = 100;
    private static final int MAX_REVIEW_SIZE = 1000;

    private Restaurant[] restaurants = new Restaurant[MAX_RESTAURANT_SIZE];
    private Review[] reviews = new Review[MAX_REVIEW_SIZE];

    private int restaurantSize = 0;
    private int reviewSize = 0;

    public boolean addRestaurant(Restaurant restaurant) {
        if (restaurantSize < MAX_RESTAURANT_SIZE) {
            restaurants[restaurantSize++] = restaurant;
            return true;
        }
        return false;
    }

    public boolean updateRestaurant(Restaurant restaurant) {
        for (int i = 0; i < restaurantSize; i++) {
            if (restaurants[i].getResId() == restaurant.getResId()) {
                restaurants[i] = restaurant;
                return true;
            }
        }
        return false;
    }

    public boolean removeRestaurant(int resId) {
        for (int i = 0; i < restaurantSize; i++) {
            if (restaurants[i].getResId() == resId) {
                for (int j = i; j < restaurantSize - 1; j++) {
                    restaurants[j] = restaurants[j + 1];
                }
                restaurants[--restaurantSize] = null;
                return true;
            }
        }
        return false;
    }

    public Restaurant[] getRestaurantList() {
        Restaurant[] result = new Restaurant[restaurantSize];
        for (int i = 0; i < restaurantSize; i++) {
            result[i] = restaurants[i];
        }
        return result;
    }

    public Restaurant getRestaurant(int resId) {
        for (int i = 0; i < restaurantSize; i++) {
            if (restaurants[i].getResId() == resId) {
                return restaurants[i];
            }
        }
        return null;
    }

    public boolean addReview(Review review) {
        if (reviewSize < MAX_REVIEW_SIZE) {
            reviews[reviewSize++] = review;
            return true;
        }
        return false;
    }

    public boolean removeReview(int reviewId) {
        for (int i = 0; i < reviewSize; i++) {
            if (reviews[i].getReviewId() == reviewId) {
                for (int j = i; j < reviewSize - 1; j++) {
                    reviews[j] = reviews[j + 1];
                }
                reviews[--reviewSize] = null;
                return true;
            }
        }
        return false;
    }

    public Review[] getRestaurantReview(int resId) {
        int count = 0;
        for (int i = 0; i < reviewSize; i++) {
            if (reviews[i].getResId() == resId) {
                count++;
            }
        }
        Review[] result = new Review[count];
        int idx = 0;
        for (int i = 0; i < reviewSize; i++) {
            if (reviews[i].getResId() == resId) {
                result[idx++] = reviews[i];
            }
        }
        return result;
    }
}
