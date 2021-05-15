package repository.randomAccessMemory.impl;

import model.randomAccesMemory.RandomAccessMemory;
import org.hibernate.Session;
import repository.randomAccessMemory.RandomAccessMemoryRepository;
import repository.sessionFactory.SessionFactoryAccess;

import java.util.List;

public class RandomAccessMemoryRepositoryImpl implements RandomAccessMemoryRepository {
    @Override
    public RandomAccessMemory save(RandomAccessMemory randomAccessMemory) {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(randomAccessMemory);
        session.getTransaction().commit();
        session.close();
        return randomAccessMemory;
    }

    @Override
    public RandomAccessMemory update(RandomAccessMemory randomAccessMemory) {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(randomAccessMemory);
        session.getTransaction().commit();
        session.close();
        return randomAccessMemory;
    }

    @Override
    public RandomAccessMemory delete(RandomAccessMemory randomAccessMemory) {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(randomAccessMemory);
        session.getTransaction().commit();
        session.close();
        return randomAccessMemory;
    }

    @Override
    public RandomAccessMemory findById(int id) {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        RandomAccessMemory randomAccessMemory = session.get(RandomAccessMemory.class, id);
        session.close();
        return randomAccessMemory;
    }

    @Override
    public List<RandomAccessMemory> getAll() {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        List<RandomAccessMemory> randomAccessMemories = (List<RandomAccessMemory>) session.
                createQuery("from RandomAccessMemory").list();
        session.close();
        return randomAccessMemories;
    }
}
