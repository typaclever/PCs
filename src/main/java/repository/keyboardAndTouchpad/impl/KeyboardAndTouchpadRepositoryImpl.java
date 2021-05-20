package repository.keyboardAndTouchpad.impl;

import Exeptions.keyboardAndTouchpad.KeyboardAndTouchpadDeleteException;
import Exeptions.keyboardAndTouchpad.KeyboardAndTouchpadUpdateException;
import model.keyboardAndTouchpad.KeyboardAndTouchpad;
import org.hibernate.Session;
import repository.keyboardAndTouchpad.KeyboardAndTouchpadRepository;
import repository.sessionFactory.SessionFactoryAccess;

import javax.persistence.OptimisticLockException;
import java.util.List;

public class KeyboardAndTouchpadRepositoryImpl implements KeyboardAndTouchpadRepository {
    @Override
    public KeyboardAndTouchpad save(KeyboardAndTouchpad keyboardAndTouchpad) {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(keyboardAndTouchpad);
        session.getTransaction().commit();
        session.close();
        return keyboardAndTouchpad;
    }

    @Override
    public KeyboardAndTouchpad update(KeyboardAndTouchpad keyboardAndTouchpad) throws KeyboardAndTouchpadUpdateException {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(keyboardAndTouchpad);
        try {
            session.getTransaction().commit();
        } catch (OptimisticLockException e) {
            throw new KeyboardAndTouchpadUpdateException("Error while updating Display object");
        }
        session.close();
        return keyboardAndTouchpad;
    }

    @Override
    public KeyboardAndTouchpad delete(KeyboardAndTouchpad keyboardAndTouchpad) throws KeyboardAndTouchpadDeleteException {
        if (findById(keyboardAndTouchpad.getId())==null){
            throw new KeyboardAndTouchpadDeleteException("There is no Display object with such an id");
        }
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(keyboardAndTouchpad);
        session.getTransaction().commit();
        session.close();
        return keyboardAndTouchpad;
    }

    @Override
    public KeyboardAndTouchpad findById(int id) {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        KeyboardAndTouchpad keyboardAndTouchpad = session.get(KeyboardAndTouchpad.class, id);
        session.close();
        return keyboardAndTouchpad;
    }

    @Override
    public List<KeyboardAndTouchpad> getAll() {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        List<KeyboardAndTouchpad> keyboardAndTouchpads = (List<KeyboardAndTouchpad>) session.
                createQuery("from KeyboardAndTouchpad").list();
        session.close();
        return keyboardAndTouchpads;
    }
}
