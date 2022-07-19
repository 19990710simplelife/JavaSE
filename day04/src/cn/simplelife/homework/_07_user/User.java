package cn.simplelife.homework._07_user;

public class User {
    private int id;
    private String password;
    private String emailAddr;
    static int total;

    public User() {
        total++;
    }

    public User(int id, String password) {
        total++;
        this.id = id;
        this.password = password;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailAddr() {
        return emailAddr;
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr + "@gameschool.com";
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", emailAddr='" + emailAddr + '\'' +
                '}';
    }
}
