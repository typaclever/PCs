package repository.operationSystem.impl;

import model.operationSystem.OperationSystem;
import org.hibernate.Session;
import repository.operationSystem.OperationSystemRepository;
import repository.sessionFactory.SessionFactoryAccess;

import java.util.List;

public class OperationSystemRepositoryImpl implements OperationSystemRepository{
    @Override
    public OperationSystem save(OperationSystem operationSystem) {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(operationSystem);
        session.getTransaction().commit();
        session.close();
        return operationSystem;
    }

    @Override
    public OperationSystem update(OperationSystem operationSystem) {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(operationSystem);
        session.getTransaction().commit();
        session.close();
        return operationSystem;
    }

    @Override
    public OperationSystem delete(OperationSystem operationSystem) {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(operationSystem);
        session.getTransaction().commit();
        session.close();
        return operationSystem;
    }

    @Override
    public OperationSystem findById(int id) {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        OperationSystem operationSystem = session.get(OperationSystem.class, id);
        session.close();
        return operationSystem;
    }

    @Override
    public List<OperationSystem> getAll() {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        List<OperationSystem> operationSystems = (List<OperationSystem>)
                session.createQuery("from OperationSystem").list();
        session.close();
        return operationSystems;
    }
}
