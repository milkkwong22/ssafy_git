package ssafy2047;

import java.util.Date;

public class Article {
    private int articleId;
    private String title;
    private String context;
    private int userCode;
    private String nickName;
    private int viewCount;
    private Date regDate;

    // 생성자
    public Article(int articleId, String title, String context, int userCode, String nickName) {
        this.articleId = articleId;
        this.title = title;
        this.context = context;
        this.userCode = userCode;
        this.nickName = nickName;
        this.viewCount = 0;
        this.regDate = new Date();
    }

    // Getter와 Setter
    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public int getUserCode() {
        return userCode;
    }

    public void setUserCode(int userCode) {
        this.userCode = userCode;
    }
    
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }
}
