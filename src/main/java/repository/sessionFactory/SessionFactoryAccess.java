package repository.sessionFactory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import model.computer.Computer;
import model.noteBook.NoteBook;
import model.smartPhone.SmartPhone;

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
