package someModels.Computer;

import lombok.Data;
import someModels.Graphics.Graphics;
import someModels.Memory.Memory;
import someModels.OperationSystem.OperationSystem;
import someModels.Processor.Processor;
import someModels.RandomAccesMemory.RandomAccessMemory;

import javax.persistence.*;

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
    @OneToOne(cascade = CascadeType.PERSIST)
    private OperationSystem operationSystem;
    private int price;
}
