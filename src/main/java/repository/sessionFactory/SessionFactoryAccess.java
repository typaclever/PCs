package repository.sessionFactory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import model.Computer.Computer;
import model.Notebook.NoteBook;
import model.SmartPhone.SmartPhone;

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
