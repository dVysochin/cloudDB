package com.den.cloud.services;

import com.den.cloud.components.UserComponent;
import com.den.cloud.dao.GeneralDao;
import com.den.cloud.entities.Product;
import com.den.cloud.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private GeneralDao generalDao;
    private UserComponent userComponent;

    @Autowired
    public UserService(UserComponent userComponent) {
        this.userComponent = userComponent;
    }

    public String getNameById(int id) {
        System.out.println(userComponent.getDailyMessage());
        return generalDao.getNameById(id);
    }

    @Transactional
    public String getNameFromObject(int id) {
        User user = generalDao.getUser(id);
        return user.getName();
    }

    @Transactional
    public void listWork() {
        Product product = generalDao.getProduct(1);
        List<User> users = product.getUsers();
        users.stream().forEach(u-> System.out.println(u.getName()));
    }
}
