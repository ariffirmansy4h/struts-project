package com.example.struts2.action;

import java.util.ArrayList;
import java.util.List;
import com.example.struts2.model.Users;
import com.example.struts2.model.hibernateCRUD;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Login extends ActionSupport {

    private static final Logger log = LogManager.getLogger(Login.class);
    private Users users = new Users();
	private List<Users> userList = new ArrayList<Users>();
    private hibernateCRUD crud = new hibernateCRUD();

    private String username;
    private String password;

    public String execute(){
        return "success";
    }
    public void validate(){
        log.info("VALIDATE " + username + " " + password);
        if(username.length() == 0 ){
            addFieldError("", "Username Required !");
        }
        else if(password.length() == 0 ){
            addFieldError("", "Password Required !");
        }
        else{
            Users u = crud.getUser(username, password);
            if(u == null){
                addFieldError("", "Username Password not match !");
            }
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