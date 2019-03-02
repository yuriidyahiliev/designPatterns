package prototype;

public class Credentials {
    private User user;
    private String userName;
    private String password;

    public User getUser() throws CloneNotSupportedException {
       return user.clone();
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
