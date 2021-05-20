package repository.graphics.impl;

import Exeptions.graphics.GraphicsDeleteException;
import Exeptions.graphics.GraphicsUpdateException;
import model.graphics.Graphics;
import org.hibernate.Session;
import repository.graphics.GraphicsRepository;
import repository.sessionFactory.SessionFactoryAccess;

import javax.persistence.OptimisticLockException;
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
    public Graphics update(Graphics graphics) throws GraphicsUpdateException {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(graphics);
        try {
            session.getTransaction().commit();
        } catch (OptimisticLockException e){
            throw new GraphicsUpdateException("Error while updating Graphics object");
        }
        session.close();
        return graphics;
    }

    @Override
    public Graphics delete(Graphics graphics) throws GraphicsDeleteException {
        if (findById(graphics.getId()) == null) {
            throw new GraphicsDeleteException("There is no Graphics object with such an id");
        }
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
    public List<Graphics> getAll() {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        List<Graphics> graphics = (List<Graphics>) session.createQuery("from Graphics").list();
        session.close();
        return graphics;
    }
}
