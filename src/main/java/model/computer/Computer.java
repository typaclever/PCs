package model.computer;

import lombok.Data;
import model.graphics.Graphics;
import model.memory.Memory;
import model.operationSystem.OperationSystem;
import model.processor.Processor;
import model.randomAccesMemory.RandomAccessMemory;
import model.user.User;
import org.hibernate.Session;
import repository.sessionFactory.SessionFactoryAccess;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@Data
public class Computer {
    @Id
    private int id;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "ram_id")
    private RandomAccessMemory randomAccessMemory;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Memory memory;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Processor processor;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Graphics graphics;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "computer")
    private List<OperationSystem> operationSystems;
    @ManyToMany(mappedBy = "computers", fetch = FetchType.EAGER)
    private List<User> users;
    private int price;

    public Computer() {
        operationSystems = new ArrayList<>();
        users = new ArrayList<>();
    }

    public List<OperationSystem> operationSystems() {
        Session session = SessionFactoryAccess.getSessionFactory().openSession();
        Computer computer = session.load(Computer.class, this.id);
        Session session1 = SessionFactoryAccess.getSessionFactory().openSession();
        session1.beginTransaction();
        List<OperationSystem> systems = computer.getOperationSystems();
        session1.getTransaction().commit();
        return systems;
    }

    public OperationSystem removeOperationSystem(OperationSystem system) {
        List<OperationSystem> operationSystems = operationSystems();
        operationSystems.remove(system);
        return system;
    }

    public void addOperationSystem(OperationSystem os) {
        os.setComputer(this);
        List<OperationSystem> operationSystems = operationSystems();
        operationSystems.add(os);
    }

    public void addUser(User user) {
        user.getComputers().add(this);
        users.add(user);
    }

    public User removeUser(User user) {
        users.remove(user);
        return user;
    }

}
