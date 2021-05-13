package someModels.Processor;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Processor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String brand;
    private String series;
    private String model;
    private int numberOfCores;
    private float baseFrequency;
    private float maxFrequency;
    private int cache;
}
