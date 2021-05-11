package someModels;

public class SmartPhone extends Computer{
    private Display display;
    private Connection connection;
    private int batterySize;
    public SmartPhone(RAM ram, Memory memory, Processor processor, Graphics graphics, OperationSystem os,
                      int price, Display display, Connection connection, int batterySize) {
        super(ram, memory, processor, graphics, os, price);
        this.display = display;
        this.connection = connection;
        this.batterySize = batterySize;
    }
}
