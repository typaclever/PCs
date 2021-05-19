package model.user;

import lombok.Data;
import model.computer.Computer;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Data
@Table
@Entity
public class User {
    @Id
    String logIn;
    private byte[] salt;
    private byte[] hashPassword;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "User_Computer", joinColumns = @JoinColumn(name = "user_logIn"),
            inverseJoinColumns = @JoinColumn(name = "computer_id"))
    private List<Computer> computers;

    public User() {
        computers = new ArrayList<>();
    }

    public void addComputer(Computer computer) {
        computer.getUsers().add(this);
        computers.add(computer);
    }

    public Computer removeComputer(Computer computer) {
        computers.remove(computer);
        computer.removeUser(this);
        return computer;
    }

}
