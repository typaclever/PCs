package repository.graphics.impl;

import model.graphics.Graphics;
import org.hibernate.Session;
import repository.graphics.GraphicsRepository;
import repository.sessionFactory.SessionFactoryAccess;

import java.util.List;

public class GraphicsRepositoryImpl implements GraphicsRepository {
    @Override
    public Graphics save(Graphics graphics) {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(graphics);
        session.getTransaction().commit();
        session.close();
        return graphics;
    }

    @Override
    public Graphics update(Graphics graphics) {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(graphics);
        session.getTransaction().commit();
        session.close();
        return graphics;
    }

    @Override
    public Graphics delete(Graphics graphics) {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(graphics);
        session.getTransaction().commit();
        session.close();
        return graphics;
    }

    @Override
    public Graphics findById(int id) {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        Graphics graphics = session.get(Graphics.class, id);
        session.close();
        return graphics;
    }

    @Override
    public List getAllGraphics() {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        List graphics = session.createQuery("from Graphics").list();
        session.close();
        return graphics;
    }
}
