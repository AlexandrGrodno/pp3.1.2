package com.springboot.pp312.DAO;

//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.transaction.annotation.Transactional;

import com.springboot.pp312.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class UserDAOImpl implements UserDAO {
    @PersistenceContext
    private EntityManager em;
//    private EntityManagerFactory managerFactory;
//    @Autowired
//    public void setSessionFactory(LocalContainerEntityManagerFactoryBean managerFactoryBean) {
//        this.managerFactory = managerFactoryBean;
//    }

    @Override
    public List<User> allUser() {
        Query query = em.createQuery("from User");
        return query.getResultList();
    }
    @Override
    public User getIdUser(int id){
        Query query = em.createQuery("FROM User where id =:idUser");
        query.setParameter("idUser",id);
        return (User) query.getSingleResult();
    }

    @Override
    public void save(User user) {
        System.out.println(user.getId());
        em.merge(user);

    }

    @Override
    public void addUser() {

    }

    @Override

    public void deleteUser(int id) {
        System.out.println(id);

        em.remove(getIdUser(id));

    }

    @Override
    public void editUser() {

    }
}
