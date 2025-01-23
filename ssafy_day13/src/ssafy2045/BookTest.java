package ssafy2045;

public class BookTest {

    public static void main(String[] args) {
        Book b1 = new Book("123456", "자바의 정석", "남궁성", "도서출판", 35000, "자바 기초부터 심화까지");
        Book b2 = new Book("456789", "Effective Java", "Joshua Bloch", "Pearson", 45000, "자바의 모범 사례를 다룬 책");

        System.out.println(b1);
        System.out.println(b2);

        BookManager bm = new BookManager();

        bm.add(b1);
        bm.add(b2);

        for (Book x : bm.getList()) {
            System.out.println(x);
        }

        bm.removeByIsbn("123456");
        
        for (Book x : bm.getList()) {
            System.out.println(x);
        }
    }
}
