package someModels.RandomAccesMemory;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class RandomAccessMemory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    private String brand;
    private String tireType;
    private int frequency;
    private int throughput;
    private int size;
}
