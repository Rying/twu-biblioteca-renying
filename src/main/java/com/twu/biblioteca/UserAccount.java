package com.twu.biblioteca;

public class UserAccount {
    private final String name;
    private final String password;
    private final String email;
    private final String phone;
    private boolean logInStatus;

    public UserAccount(String name, String password, String email, String phone) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.phone = phone;
    }

    public void setLogInStatus(boolean status) {
        logInStatus = status;
    }

    public boolean logIn(String name, String password) {

        if (this.name.equals(name) && this.password.equals(password)) {
            setLogInStatus(true);
            return true;
        } else
            return false;
    }

    public String getAccountInfo() {
        return "name: " + name + "\t"
                + "email: " + email + "\t"
                + "phone: " + phone + "\n";
    }
}
