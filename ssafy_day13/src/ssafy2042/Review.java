package ssafy2042;

public class Review {
    
    private int reviewId;      // 리뷰 ID
    private String pCode;      // 제품 코드
    private String writer;     // 작성자
    private String content;    // 리뷰 내용

    // 기본 생성자
    public Review() {}

    // 모든 필드를 초기화하는 생성자
    public Review(int reviewId, String pCode, String writer, String content) {
        this.reviewId = reviewId;
        this.pCode = pCode;
        this.writer = writer;
        this.content = content;
    }

    // Getter와 Setter
    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public String getPCode() {
        return pCode;
    }

    public void setPCode(String pCode) {
        this.pCode = pCode;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    // toString 메서드 오버라이드
    @Override
    public String toString() {
        return "Review{" +
                "reviewId=" + reviewId +
                ", pCode='" + pCode + '\'' +
                ", writer='" + writer + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
