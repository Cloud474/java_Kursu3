package MySelf.Ödev.ismetHocaödev;

import java.util.ArrayList;

public class User {
    private final int id;
    private String userName;
    private int password;
    private boolean active;
    private boolean signedIn;

     static int Sayac=0;

    public User(int id, String userName, int password, boolean active, boolean signedIn) {
        this.id=++Sayac;
        setUserName(userName);
        setPassword(password);
        setActive(active);
        setSignedIn(signedIn);
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isSignedIn() {
        return signedIn;
    }

    public void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password=" + password +
                ", active=" + active +
                ", signedIn=" + signedIn +
                '}';
    }
}
