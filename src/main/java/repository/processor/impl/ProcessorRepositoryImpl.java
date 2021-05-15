package repository.processor.impl;

import model.processor.Processor;
import org.hibernate.Session;
import repository.processor.ProcessorRepository;
import repository.sessionFactory.SessionFactoryAccess;

import java.util.List;

public class ProcessorRepositoryImpl implements ProcessorRepository {
    @Override
    public Processor save(Processor processor) {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(processor);
        session.getTransaction().commit();
        session.close();
        return processor;
    }

    @Override
    public Processor update(Processor processor) {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(processor);
        session.getTransaction().commit();
        session.close();
        return processor;
    }

    @Override
    public Processor delete(Processor processor) {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(processor);
        session.getTransaction().commit();
        session.close();
        return processor;
    }

    @Override
    public Processor findById(int id) {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        Processor processor = session.get(Processor.class, id);
        session.close();
        return processor;
    }

    @Override
    public List<Processor> getAllProcessor() {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        List<Processor> processors = (List<Processor>) session.createQuery("from Processor").list();
        session.close();
        return processors;
    }
}
