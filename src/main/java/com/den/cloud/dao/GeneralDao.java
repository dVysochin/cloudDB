package com.den.cloud.dao;

import com.den.cloud.entities.Product;
import com.den.cloud.entities.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class GeneralDao {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    public String getNameById(int id) {
        User user =  (User) getSession().get(User.class, id);
        return user.getName();
    }

    public User getUser(int id) {
        return (User) getSession().load(User.class, id);
    }

    public Product getProduct(int id) {
        return (Product) getSession().get(Product.class, id);
    }

}
