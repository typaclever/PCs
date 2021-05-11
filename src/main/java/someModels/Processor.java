package someModels;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Processor {
    private String brand;
    private String series;
    private String model;
    private int coresCount;
    private float baseFrequency;
    private float maxFrequency;
    private float cache;
}
