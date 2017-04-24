package com.example.struts2.model;

import java.util.ArrayList;
import java.util.List;
import com.example.struts2.HibernateListener;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Query;
import org.hibernate.Transaction;
import org.apache.struts2.ServletActionContext;

public class hibernateCRUD {

    private SessionFactory sf = (SessionFactory) ServletActionContext.getServletContext().getAttribute(HibernateListener.KEY_NAME);
    private Transaction transaction;
    
    public void addUser(Users users) {
        Session session = sf.openSession();
        transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(users);
            session.getTransaction().commit();
        }
        catch (Exception e) {
            if(transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
        }
        finally {
            session.flush();
            session.close();
        }
    }

    public void deleteUser(int id) {
        Session session = sf.openSession();
        transaction = null;
        try {
            transaction = session.beginTransaction();
            Users users = (Users) session.load(Users.class, new Integer(id));
            session.delete(users);
            session.getTransaction().commit();
        }
        catch (Exception e) {
            if(transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
        }
        finally {
            session.flush();
            session.close();
        }
    }

    public void updateUser(Users users) {
        Session session = sf.openSession();
        transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(users);
            session.getTransaction().commit();
        }
        catch (Exception e) {
            if(transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        finally {
            session.flush();
            session.close();
        }
    }

    public List<Users> getAllUsers() {
        List<Users> users = new ArrayList<Users>();
        Session session = sf.openSession();
        transaction = null;
        try {
            transaction = session.beginTransaction();
            users = session.createQuery("from users").list();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        finally {
            session.flush();
            session.close();
        }
        return users;
    }

    public Users getUser(String username, String password) {
        Session session = sf.openSession();
        transaction = null;
        Users user = null;
        try {
            transaction = session.beginTransaction();
            String queryString = "from users where username = :username and password = :password";
            Query query = session.createQuery(queryString);
            query.setString("username", username);
            query.setString("password", password);
            user = (Users) query.uniqueResult();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        finally {
            session.flush();
            session.close();
        }
        return user;
    }
}