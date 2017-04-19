package com.example.struts2.action;

import com.opensymphony.xwork2.ActionSupport;

public class Login extends ActionSupport {

    private String username;
    private String password;

    public String execute(){
        return "success";
    }
    public void validate(){
        if(username.length() == 0 ){
            addFieldError("", "Username Required !");
        }
        else if(password.length() == 0 ){
            addFieldError("", "Password Required !");
        }
        else if(username=="admin" && password=="admin"){
            addFieldError("", "Username Password not match !");
        }
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername(){
        return username;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return password;
    }

}