package repository.display.impl;

import model.display.Display;
import org.hibernate.Session;
import repository.display.DisplayRepository;
import repository.sessionFactory.SessionFactoryAccess;

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
    public Display update(Display display) {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(display);
        session.getTransaction().commit();
        session.close();
        return display;
    }

    @Override
    public Display delete(Display display) {
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
