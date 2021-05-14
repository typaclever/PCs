package model.user;

import lombok.Data;
import model.computer.Computer;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String logIn;
    private String password;
    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "user", fetch = FetchType.LAZY)
    private List<Computer> computers;
}
