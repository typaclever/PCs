package model.Computer;

import lombok.Data;
import model.Graphics.Graphics;
import model.Memory.Memory;
import model.OperationSystem.OperationSystem;
import model.Processor.Processor;
import model.RandomAccesMemory.RandomAccessMemory;

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
