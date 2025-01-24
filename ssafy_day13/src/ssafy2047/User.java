package ssafy2047;

public class User {
    private int userCode;
    private String userId;
    private String userPassword;
    private String userName;
    private String nickName;
    private String email;

    @Override
	public String toString() {
		return "User [userCode=" + userCode + ", userId=" + userId + ", userPassword=" + userPassword + ", userName="
				+ userName + ", nickName=" + nickName + ", email=" + email + "]";
	}

	// 생성자
    public User(int userCode, String userId, String userPassword, String userName, String nickName, String email) {
        this.userCode = userCode;
        this.userId = userId;
        this.userPassword = userPassword;
        this.userName = userName;
        this.nickName = nickName;
        this.email = email;
    }

    // Getter와 Setter
    public int getUserCode() {
        return userCode;
    }

    public void setUserCode(int userCode) {
        this.userCode = userCode;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
