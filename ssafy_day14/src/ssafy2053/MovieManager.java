package ssafy2053;

public class MovieManager {
    int maxSize = 100;
    Movie[] movieList = new Movie[maxSize];
    int size = 0;

    void add(Movie movie) {
        movieList[size++] = movie;
    }

    Movie[] getList() {
        Movie[] result = new Movie[size];
        System.arraycopy(movieList, 0, result, 0, size);
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

    Movie[] getMovies() {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (!(movieList[i] instanceof SeriesMovie)) {
                count++;
            }
        }
        Movie[] result = new Movie[count];
        int idx = 0;
        for (int i = 0; i < size; i++) {
            if (!(movieList[i] instanceof SeriesMovie)) {
                result[idx++] = movieList[i];
            }
        }
        return result;
    }

    SeriesMovie[] getSeriesMovies() {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (movieList[i] instanceof SeriesMovie) {
                count++;
            }
        }
        SeriesMovie[] result = new SeriesMovie[count];
        int idx = 0;
        for (int i = 0; i < size; i++) {
            if (movieList[i] instanceof SeriesMovie) {
                result[idx++] = (SeriesMovie) movieList[i];
            }
        }
        return result;
    }

    double getRunningTimeAvg() {
        if (size == 0) return 0;
        int total = 0;
        for (int i = 0; i < size; i++) {
            total += movieList[i].getRunningTime();
        }
        return (double) total / size;
    }
}