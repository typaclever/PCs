package someModels;

public class Memory {
    String brand;
    String type;
    String connectionInterface;
    int readSpeed;
    int writeSpeed;
    int size;

    public Memory(String brand, String type, String connectionInterface, int readSpeed, int writeSpeed, int size) {
        this.brand = brand;
        this.type = type;
        this.connectionInterface = connectionInterface;
        this.readSpeed = readSpeed;
        this.writeSpeed = writeSpeed;
        this.size = size;
    }
}
