package ssafy2044;

public class MovieManager {
	
	int maxSize = 100;
	Movie[] movieList = new Movie[maxSize];
	int size = 0;
	
	void add(Movie movie) {
		movieList[size++] = movie;
	}
	
	Movie[] getList(){
		Movie[] result = new Movie[size];
		for(int i = 0; i < size; i++ ) {
			result[i] = movieList[i];
		}
		return result;
	}
	
	Movie[] searchByTitle(String searchname) {
		int count = 0;
		for (int i = 0; i < size; i++) {
			if (movieList[i].getTitle().contains(searchname)) {
				count++;
			}
		}
		Movie[] result = new Movie[count];
		int idx = 0;
		for (int i = 0; i < size; i++) {
			if (movieList[i].getTitle().contains(searchname)) {
				result[idx++] = movieList[i];
			}
		}
		return result;
	}
}
