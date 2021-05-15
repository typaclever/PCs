package repository.smartPhone.impl;

import model.smartPhone.SmartPhone;
import org.hibernate.Session;
import repository.sessionFactory.SessionFactoryAccess;
import repository.smartPhone.SmartPhoneRepository;

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
    public SmartPhone update(SmartPhone smartPhone) {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(smartPhone);
        session.getTransaction().commit();
        session.close();
        return smartPhone;
    }

    @Override
    public SmartPhone delete(SmartPhone smartPhone) {
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
    public List<SmartPhone> getAllSmartphones() {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        List<SmartPhone> smartPhones = (List<SmartPhone>) session.createQuery("from SmartPhone").list();
        session.close();
        return smartPhones;
    }
}
