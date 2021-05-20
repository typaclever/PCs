package model.memory;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Memory {
    @Id
    private int id;
    private String brand;
    private String type;
    private String connectionInterface;
    private int readSpeed;
    private int writeSpeed;
    private int size;
}
