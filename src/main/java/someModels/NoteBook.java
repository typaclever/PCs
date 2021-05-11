package someModels;

public class NoteBook extends Computer {
    private Display display;
    private KeyboardAndTouchpad keyboardAndTouchpad;
    private int batterySize;
    public NoteBook(RAM ram, Memory memory, Processor processor, Graphics graphics, OperationSystem os,
                    int price, Display display, int batterySize , KeyboardAndTouchpad keyboardAndTouchpad) {
        super(ram, memory, processor, graphics, os, price);
        this.display = display;
        this.batterySize = batterySize;
        this.keyboardAndTouchpad = keyboardAndTouchpad;
    }
}
