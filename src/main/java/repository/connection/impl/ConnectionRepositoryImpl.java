package repository.connection.impl;

import model.connection.Connection;
import org.hibernate.Session;
import repository.connection.ConnectionRepository;
import repository.sessionFactory.SessionFactoryAccess;

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
    public Connection update(Connection connection) {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(connection);
        session.getTransaction().commit();
        session.close();
        return connection;
    }

    @Override
    public Connection delete(Connection connection) {
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
    public List<Connection> getAllConnections() {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        List<Connection> connections = (List<Connection>) session.createQuery("from Connection").list();
        session.close();
        return connections;
    }
}
