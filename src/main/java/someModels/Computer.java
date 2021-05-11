package someModels;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Computer {
    private RandomAccesMemory randomAccesMemory;
    private Memory memory;
    private Processor processor;
    private Graphics graphics;
    private OperationSystem operationSystem;
    private int price;
}
