package ssafy2047;

import java.util.Date;

public class Comment {
    private int articleId;
    private int commentId;
    private int userCode;
    private String comment;
    private Date regDate;

    // 생성자
    public Comment(int articleId, int commentId, int userCode, String comment, Date regDate) {
        this.articleId = articleId;
        this.commentId = commentId;
        this.userCode = userCode;
        this.comment = comment;
        this.regDate = regDate;
    }

    // Getter와 Setter
    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public int getUserCode() {
        return userCode;
    }

    public void setUserCode(int userCode) {
        this.userCode = userCode;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }
}
