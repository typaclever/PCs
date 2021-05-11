package someModels;

public class NoteBook extends Computer {
    private Display display;
    private KeyboardAndTouchpad keyboardAndTouchpad;
    private int batterySize;

    public NoteBook(RandomAccesMemory randomAccesMemory, Memory memory, Processor processor,
                    Graphics graphics, OperationSystem operationSystem, int price, Display display,
                    KeyboardAndTouchpad keyboardAndTouchpad, int batterySize) {
        super(randomAccesMemory, memory, processor, graphics, operationSystem, price);
        this.display = display;
        this.keyboardAndTouchpad = keyboardAndTouchpad;
        this.batterySize = batterySize;
    }
}
