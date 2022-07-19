package cn.simplelife.homework.user;

import com.sun.org.omg.CORBA.AttrDescriptionSeqHelper;

public class User {
    private Integer id;
    private String password;
    private String email;

    public User() {
    }

    public User(Integer id, String password) {
        this.id = id;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", email='" + email + "@gameschool.com" + '\'' +
                '}';
    }
}
