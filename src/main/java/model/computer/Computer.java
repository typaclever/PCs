package model.computer;

import lombok.Data;
import model.graphics.Graphics;
import model.memory.Memory;
import model.operationSystem.OperationSystem;
import model.processor.Processor;
import model.randomAccesMemory.RandomAccessMemory;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne(cascade = CascadeType.PERSIST)
    private RandomAccessMemory randomAccessMemory;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Memory memory;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Processor processor;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Graphics graphics;
    @OneToMany(cascade = CascadeType.PERSIST)
    private List<OperationSystem> operationSystems;
    private int price;
}
