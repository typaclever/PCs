package someModels;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Memory {
    private String brand;
    private String type;
    private String connectionInterface;
    private int readSpeed;
    private int writeSpeed;
    private int size;
}
