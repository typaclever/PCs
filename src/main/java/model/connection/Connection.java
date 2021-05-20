package model.connection;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Connection {
    @Id
    private int id;
    private String bands;
    private String connections;
}
