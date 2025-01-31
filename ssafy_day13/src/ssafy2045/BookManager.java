package ssafy2045;

public class BookManager {

    int maxSize = 100;
    Book[] bookList = new Book[maxSize];
    int size = 0;

    void add(Book book) {
        bookList[size++] = book;
    }

    Book[] getList() {
    	System.out.println("*****도서목록*****");
        Book[] result = new Book[size];
        for (int i = 0; i < size; i++) {
            result[i] = bookList[i];
        }
        return result;
    }
    void removeByIsbn(String searchIsbn) {
    	System.out.println("*****도서제거*****");
        for (int i = 0; i < size; i++) {
            if (bookList[i].getIsbn().equals(searchIsbn)) {
            	for (int j = i; j < size-1; j++) {
            		bookList[j] = bookList[j+1];
            	}
            	bookList[size-1] = null;
            	size--;
            	break;
            }
        }
    }
        
    

    Book[] searchByIsbn(String searchIsbn) {
    	System.out.println("*****도서조회*****");
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (bookList[i].getIsbn().contains(searchIsbn)) {
                count++;
            }
        }
        Book[] result = new Book[count];
        int idx = 0;
        for (int i = 0; i < size; i++) {
            if (bookList[i].getIsbn().contains(searchIsbn)) {
                result[idx++] = bookList[i];
            }
        }
        return result;
    }
}
