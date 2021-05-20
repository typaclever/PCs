package repository.display.impl;

import Exeptions.display.DisplayDeleteException;
import Exeptions.display.DisplayUpdateException;
import model.display.Display;
import org.hibernate.Session;
import repository.display.DisplayRepository;
import repository.sessionFactory.SessionFactoryAccess;

import javax.persistence.OptimisticLockException;
import java.util.List;

public class DisplayRepositoryImpl implements DisplayRepository{
    @Override
    public Display save(Display display) {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(display);
        session.getTransaction().commit();
        session.close();
        return display;
    }

    @Override
    public Display update(Display display) throws DisplayUpdateException {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(display);
        try {
            session.getTransaction().commit();
        } catch (OptimisticLockException e){
            throw new DisplayUpdateException("Error while updating Display object");
        }
        session.close();
        return display;
    }

    @Override
    public Display delete(Display display) throws DisplayDeleteException {
        if (findById(display.getId()) == null){
            throw new DisplayDeleteException("There is no Display object with such an id");
        }
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(display);
        session.getTransaction().commit();
        session.close();
        return display;
    }

    @Override
    public Display findById(int id) {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        Display display = session.get(Display.class, id);
        session.close();
        return display;
    }

    @Override
    public List<Display> getAll() {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        List<Display> displays = (List<Display>) session.createQuery("from Display").list();
        session.close();
        return displays;
    }
}
