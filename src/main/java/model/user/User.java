package model.user;

import lombok.Data;
import model.computer.Computer;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

@Data
@Entity
public class User {
    @Id
    String logIn;
    private byte[] salt;
    private byte[] hashPassword;
    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "user", fetch = FetchType.LAZY)
    private List<Computer> computers;
}
