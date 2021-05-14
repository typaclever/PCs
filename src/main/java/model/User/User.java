package model.User;

import lombok.Data;
import model.Computer.Computer;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;
    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Computer> computers;
}
