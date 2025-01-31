package ssafy2044;

public class MovieTest {

	public static void main(String[] args) {
		Movie m1 = new Movie(15, "아바타", "카메론", "판타지", 200);
		Movie m2 = new Movie(16, "앙바타", "카메오", "코미디", 210);
		
		System.out.println(m1);
		System.out.println(m2);
		
		MovieManager mm = new MovieManager();
		
		mm.add(m1);
		mm.add(m2);
		
		for (Movie x : mm.getList()) {
			System.out.println(x);
		}
		
		
		Movie[] searchList = mm.searchByTitle("바");
		for (Movie x : searchList ) {
			System.out.println(x);
		}
	}

}
