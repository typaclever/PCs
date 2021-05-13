package someModels.Connection;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Connection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String bands;
    private String connections;
}
