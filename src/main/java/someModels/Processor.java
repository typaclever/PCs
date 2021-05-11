package someModels;

public class Processor {
    private String brand;
    private String series;
    private String model;
    private int coresCount;
    private float baseFrequency;
    private float maxFrequency;
    private float cache;

    public Processor(String brand, String series, String model, int coresCount, float baseFrequency,
                     float maxFrequency, float cache) {
        this.brand = brand;
        this.series = series;
        this.model = model;
        this.coresCount = coresCount;
        this.baseFrequency = baseFrequency;
        this.maxFrequency = maxFrequency;
        this.cache = cache;
    }
}
