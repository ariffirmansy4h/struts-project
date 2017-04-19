package com.example.struts2.action;

import com.example.struts2.model.Users;
import com.example.struts2.HibernateListener;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Login extends ActionSupport {

    private static final Logger log = LogManager.getLogger(Login.class);
    private String username;
    private String password;
    private Users users = new Users();

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
        else if(!username.equals("admin") && !password.equals("admin")){
            addFieldError("", "Username Password not match !");
        }
        else {
            SessionFactory sf = (SessionFactory) ServletActionContext.getServletContext().getAttribute(HibernateListener.KEY_NAME);
            Session session = sf.openSession();
            users.setUsername(username);
            users.setPassword(password);
            session.beginTransaction();
            session.save(users);
            session.getTransaction().commit();

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