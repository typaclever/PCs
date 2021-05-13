package repository.SessionFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import repository.SmartPhone.SmartPhoneInterface;
import someModels.Computer.Computer;
import someModels.Notebook.NoteBook;
import someModels.SmartPhone.SmartPhone;

public class SessionFactoryAccess {
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            Configuration configuration = new Configuration().configure();
            configuration.addAnnotatedClass(Computer.class);
            configuration.addAnnotatedClass(NoteBook.class);
            configuration.addAnnotatedClass(SmartPhone.class);
            sessionFactory = configuration.buildSessionFactory();
        }
        return sessionFactory;
    }
}
