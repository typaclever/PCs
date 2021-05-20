package repository.noteBook.impl;

import Exeptions.noteBook.NoteBookDeleteException;
import Exeptions.noteBook.NoteBookUpdateException;
import model.noteBook.NoteBook;
import org.hibernate.Session;
import repository.noteBook.NoteBookRepository;
import repository.sessionFactory.SessionFactoryAccess;

import javax.persistence.OptimisticLockException;
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
    public NoteBook update(NoteBook noteBook) throws NoteBookUpdateException {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(noteBook);
        try {
            session.getTransaction().commit();
        } catch (OptimisticLockException e) {
            throw new NoteBookUpdateException("Error while updating NoteBook object");
        }
        session.close();
        return noteBook;
    }

    @Override
    public NoteBook delete(NoteBook noteBook) throws NoteBookDeleteException {
        if (findById(noteBook.getId()) == null) {
            throw new NoteBookDeleteException("There is no NoteBook object with such an id");
        }
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
    public List<NoteBook> getAll() {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        List<NoteBook> noteBooks = (List<NoteBook>) session.createQuery("from NoteBook").list();
        session.close();
        return null;
    }
}
