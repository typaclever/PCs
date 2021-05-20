package repository.smartPhone.impl;

import Exeptions.smartPhone.SmartPhoneDeleteException;
import Exeptions.smartPhone.SmartPhoneUpdateException;
import model.smartPhone.SmartPhone;
import org.hibernate.Session;
import repository.sessionFactory.SessionFactoryAccess;
import repository.smartPhone.SmartPhoneRepository;

import javax.persistence.OptimisticLockException;
import java.util.List;

public class SmartPhoneRepositoryImpl implements SmartPhoneRepository{
    @Override
    public SmartPhone save(SmartPhone smartPhone) {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(smartPhone);
        session.getTransaction().commit();
        session.close();
        return smartPhone;
    }

    @Override
    public SmartPhone update(SmartPhone smartPhone) throws SmartPhoneUpdateException {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(smartPhone);
        try {
            session.getTransaction().commit();
        } catch (OptimisticLockException e) {
            throw new SmartPhoneUpdateException("Error while updating SmartPhone object");
        }
        session.close();
        return smartPhone;
    }

    @Override
    public SmartPhone delete(SmartPhone smartPhone) throws SmartPhoneDeleteException {
        if (findById(smartPhone.getId()) == null) {
            throw new SmartPhoneDeleteException("There is no SmartPhone object with such an id");
        }
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(smartPhone);
        session.getTransaction().commit();
        session.close();
        return smartPhone;
    }

    @Override
    public SmartPhone findById(int id) {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        SmartPhone smartPhone = session.get(SmartPhone.class, id);
        session.close();
        return smartPhone;
    }

    @Override
    public List<SmartPhone> getAll() {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        List<SmartPhone> smartPhones = (List<SmartPhone>) session.createQuery("from SmartPhone").list();
        session.close();
        return smartPhones;
    }
}
