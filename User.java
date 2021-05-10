package com.company;

public class User {
    private String user_id;
    private String password;
    private boolean login_status;

    public User(){
        login_status = false;
    }

    public String get_userId() {
        return user_id;
    }

    public void set_userId(String user_id) {
        this.user_id = user_id;
    }

    public String get_pass() {
        return password;
    }

    public void set_pass(String password) {
        this.password = password;
    }

    public boolean verify_login() {
        if(user_id.equals("admin")) {

            if(password.equals("admin")) {
                login_status = true;
            }
        }
        return login_status;
    }
}
