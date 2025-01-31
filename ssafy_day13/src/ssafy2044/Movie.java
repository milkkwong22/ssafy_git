package ssafy2044;

public class Movie {
	
	
	private int id;
	private String title;
	private String director;
	private String genre;
	private int runningTime;
	
	public Movie(int id, String title, String director, String genre, int runningTime) {
		this.id = id;
		this.title = title;
		this.director = director;
		this.genre = genre;
		this.runningTime = runningTime;
	}

	int getId() {
		return id;
	}
	
	void setId(int id) {
		this.id = id;
	}
	
	String getTitle() {
		return title;
	}
	
	void setTitle(String title) {
		this.title = title;
	}
	
	String getDirector() {
		return director;
	}
	
	void setDirector(String director) {
		this.director = director;
	}
	
	String getGenre() {
		return genre;
	}
	
	void setGenre(String genre) {
		this.genre = genre;
	}
	
	int getRunningTime() {
		return runningTime;
	}
	
	void setRunningTime(int runningTime) {
		this.runningTime = runningTime;
	}
	
	@Override
	public String toString() {
		return "id " + id + " title "+ title;
	}
	
	
}
