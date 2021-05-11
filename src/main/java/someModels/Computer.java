package someModels;

public class Computer {
    private RAM ram;
    private Memory memory;
    private Processor processor;
    private Graphics graphics;
    private OperationSystem os;
    private int price;

    public Computer(RAM ram, Memory memory, Processor processor, Graphics graphics,
                    OperationSystem os, int price) {
        this.ram = ram;
        this.memory = memory;
        this.processor = processor;
        this.graphics = graphics;
        this.os = os;
        this.price = price;
    }
}
