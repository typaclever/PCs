package model.processor;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Processor {
    @Id
    private int id;
    private String brand;
    private String series;
    private String model;
    private int numberOfCores;
    private float baseFrequency;
    private float maxFrequency;
    private int cache;
}
