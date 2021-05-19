package repository.user.impl;

import model.computer.Computer;
import model.user.User;
import org.hibernate.Session;
import repository.sessionFactory.SessionFactoryAccess;
import repository.user.UserRepository;

import java.util.List;

public class UserRepositoryImpl implements UserRepository{
    @Override
    public User save(User user) {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        session.close();
        return user;
    }

    @Override
    public User update(User user) {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(user);
        session.getTransaction().commit();
        session.close();
        return user;
    }

    @Override
    public User delete(User user) {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(user);
        session.getTransaction().commit();
        session.close();
        return user;
    }

    @Override
    public User findById(String id) {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        User user = session.get(User.class, id);
        session.close();
        return user;
    }

    @Override
    public List<User> findAll() {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        List<User> users = (List<User>) session.createQuery("from User").list();
        session.close();
        return users;
    }
}
