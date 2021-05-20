package repository.connection.impl;

import Exeptions.computer.ComputerDeleteException;
import Exeptions.connection.ConnectionUpdateException;
import model.connection.Connection;
import org.hibernate.Session;
import repository.connection.ConnectionRepository;
import repository.sessionFactory.SessionFactoryAccess;

import javax.persistence.OptimisticLockException;
import java.util.List;

public class ConnectionRepositoryImpl implements ConnectionRepository {
    @Override
    public Connection save(Connection connection) {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(connection);
        session.getTransaction().commit();
        session.close();
        return connection;
    }

    @Override
    public Connection update(Connection connection) throws ConnectionUpdateException {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(connection);
        try {
            session.getTransaction().commit();
        }catch (OptimisticLockException e){
            throw new ConnectionUpdateException("Error while updating Connection object");
        }
        session.close();
        return connection;
    }

    @Override
    public Connection delete(Connection connection) throws ComputerDeleteException {
        if (findById(connection.getId()) == null){
            throw new ComputerDeleteException("There is no connection object with such an id");
        }
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(connection);
        session.getTransaction().commit();
        session.close();
        return connection;
    }

    @Override
    public Connection findById(int id) {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        Connection connection = session.get(Connection.class, id);
        session.close();
        return connection;
    }

    @Override
    public List<Connection> getAll() {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        List<Connection> connections = (List<Connection>) session.createQuery("from Connection").list();
        session.close();
        return connections;
    }
}
