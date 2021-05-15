package repository.noteBook.impl;

import model.noteBook.NoteBook;
import org.hibernate.Session;
import repository.noteBook.NoteBookRepository;
import repository.sessionFactory.SessionFactoryAccess;

import java.util.List;

public class NoteBookRepositoryImpl implements NoteBookRepository {
    @Override
    public NoteBook save(NoteBook noteBook) {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(noteBook);
        session.getTransaction().commit();
        session.close();
        return noteBook;
    }

    @Override
    public NoteBook update(NoteBook noteBook) {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(noteBook);
        session.getTransaction().commit();
        session.close();
        return noteBook;
    }

    @Override
    public NoteBook delete(NoteBook noteBook) {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(noteBook);
        session.getTransaction().commit();
        session.close();
        return noteBook;
    }

    @Override
    public NoteBook findById(int id) {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        NoteBook noteBook = session.get(NoteBook.class, id);
        session.close();
        return noteBook;
    }

    @Override
    public List<NoteBook> getAllNote() {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        List<NoteBook> noteBooks = (List<NoteBook>) session.createQuery("from NoteBook").list();
        session.close();
        return null;
    }
}
