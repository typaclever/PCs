package someModels;

public class Memory {
    private String brand;
    private String type;
    private String connectionInterface;
    private int readSpeed;
    private int writeSpeed;
    private int size;

    public Memory(String brand, String type, String connectionInterface, int readSpeed, int writeSpeed, int size) {
        this.brand = brand;
        this.type = type;
        this.connectionInterface = connectionInterface;
        this.readSpeed = readSpeed;
        this.writeSpeed = writeSpeed;
        this.size = size;
    }
}
