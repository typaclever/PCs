package someModels.RandomAccesMemory;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
