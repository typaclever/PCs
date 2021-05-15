package repository.memory.impl;

import model.memory.Memory;
import org.hibernate.Session;
import repository.memory.MemoryRepository;
import repository.sessionFactory.SessionFactoryAccess;

import java.util.List;

public class MemoryRepositoryImpl implements MemoryRepository{
    @Override
    public Memory save(Memory memory) {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(memory);
        session.getTransaction().commit();
        return memory;
    }

    @Override
    public Memory update(Memory memory) {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(memory);
        session.getTransaction().commit();
        session.close();
        return memory;
    }

    @Override
    public Memory delete(Memory memory) {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(memory);
        session.getTransaction().commit();
        session.close();
        return memory;
    }

    @Override
    public Memory findById(int id) {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        Memory memory = session.get(Memory.class, id);
        session.close();
        return memory;
    }

    @Override
    public List getAllMemories() {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        List memories = session.createQuery("from Memory").list();
        session.close();
        return memories;
    }
}
