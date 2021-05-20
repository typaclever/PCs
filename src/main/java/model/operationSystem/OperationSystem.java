package model.operationSystem;

import lombok.Data;
import model.computer.Computer;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@Entity
public class OperationSystem {
    @Id
    private int id;
    private String brand;
    private String name;
    private String version;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "computer_id")
    private Computer computer;
}
