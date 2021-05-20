package repository.processor.impl;

import Exeptions.processor.ProcessorDeleteException;
import Exeptions.processor.ProcessorUpdateException;
import model.processor.Processor;
import org.hibernate.Session;
import repository.processor.ProcessorRepository;
import repository.sessionFactory.SessionFactoryAccess;

import javax.persistence.OptimisticLockException;
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
    public Processor update(Processor processor) throws ProcessorUpdateException {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(processor);
        try {
            session.getTransaction().commit();
        } catch (OptimisticLockException e) {
            throw new ProcessorUpdateException("Error while updating Processor object");
        }
        session.close();
        return processor;
    }

    @Override
    public Processor delete(Processor processor) throws ProcessorDeleteException {
        if (findById(processor.getId()) == null) {
            throw new ProcessorDeleteException("There is no Processor object with such an id");
        }
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
    public List<Processor> getAll() {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        List<Processor> processors = (List<Processor>) session.createQuery("from Processor").list();
        session.close();
        return processors;
    }
}
