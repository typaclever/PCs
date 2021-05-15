package repository.computer.impl;


import model.computer.Computer;
import org.hibernate.Session;
import repository.computer.ComputerRepository;
import repository.sessionFactory.SessionFactoryAccess;

import java.util.List;

public class ComputerRepositoryImpl implements ComputerRepository {
    @Override
    public Computer save(Computer computer) {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(computer);
        session.getTransaction().commit();
        session.close();
        return computer;
    }

    @Override
    public Computer update(Computer computer) {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(computer);
        session.getTransaction().commit();
        session.close();
        return computer;
    }

    @Override
    public Computer delete(Computer computer) {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(computer);
        session.getTransaction().commit();
        session.close();
        return computer;
    }

    @Override
    public List<Computer> getAllComputers() {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        List<Computer> computers = (List<Computer>) session.createQuery("from Computer").list();
        session.close();
        return computers;
    }

    @Override
    public Computer findById(int id) {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        Computer computer = session.get(Computer.class, id);
        session.close();
        return computer;
    }
}
