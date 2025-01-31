package ssafy2053;

public class MovieTest {
    public static void main(String[] args) {
        Movie m1 = new Movie(15, "아바타", "카메론", "판타지", 200);
        Movie m2 = new Movie(16, "앙바타", "카메오", "코미디", 210);
        SeriesMovie s1 = new SeriesMovie(17, "반지의 제왕", "피터 잭슨", "판타지", 180, 1, "여정의 시작");
        SeriesMovie s2 = new SeriesMovie(18, "반지의 제왕", "피터 잭슨", "판타지", 200, 2, "두 개의 탑");

        MovieManager mm = new MovieManager();
        mm.add(m1);
        mm.add(m2);
        mm.add(s1);
        mm.add(s2);

        System.out.println("전체 영화 목록:");
        for (Movie x : mm.getList()) {
            System.out.println(x);
        }

        System.out.println("\n'바'가 포함된 영화 검색 결과:");
        for (Movie x : mm.searchByTitle("바")) {
            System.out.println(x);
        }

        System.out.println("\n일반 영화 목록:");
        for (Movie x : mm.getMovies()) {
            System.out.println(x);
        }

        System.out.println("\n시리즈 영화 목록:");
        for (SeriesMovie x : mm.getSeriesMovies()) {
            System.out.println(x);
        }

        System.out.println("\n전체 영화 평균 상영 시간: " + mm.getRunningTimeAvg() + "분");
    }
}
