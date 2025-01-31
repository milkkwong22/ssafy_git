package ssafy2047;

import java.util.Date;

public class Comment {
    private int articleId;
    private int commentId;
    private int userCode;
    private String comment;
    private Date regDate;
    private String nickName;

	// 생성자
    public Comment(int articleId, int commentId, int userCode, String nickName, String comment) {
        this.articleId = articleId;
        this.commentId = commentId;
        this.userCode = userCode;
        this.nickName = nickName;
        this.comment = comment;
        this.regDate = new Date();
    }

    // Getter와 Setter
    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    @Override
	public String toString() {
		return "Comment [articleId=" + articleId + ", commentId=" + commentId + ", userCode=" + userCode + ", comment="
				+ comment + ", regDate=" + regDate + ", nickName=" + nickName + "]";
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
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
