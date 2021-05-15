package repository.sessionFactory;

import model.connection.Connection;
import model.display.Display;
import model.graphics.Graphics;
import model.keyboardAndTouchpad.KeyboardAndTouchpad;
import model.memory.Memory;
import model.operationSystem.OperationSystem;
import model.processor.Processor;
import model.randomAccesMemory.RandomAccessMemory;
import model.user.User;
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
            configuration.addAnnotatedClass(Connection.class);
            configuration.addAnnotatedClass(Display.class);
            configuration.addAnnotatedClass(KeyboardAndTouchpad.class);
            configuration.addAnnotatedClass(Memory.class);
            configuration.addAnnotatedClass(OperationSystem.class);
            configuration.addAnnotatedClass(Processor.class);
            configuration.addAnnotatedClass(RandomAccessMemory.class);
            configuration.addAnnotatedClass(User.class);
            configuration.addAnnotatedClass(Graphics.class);
            sessionFactory = configuration.buildSessionFactory();
        }
        return sessionFactory;
    }
}
