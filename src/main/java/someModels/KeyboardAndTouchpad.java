package someModels;

public class KeyboardAndTouchpad {
    private boolean numPad;
    private boolean keyboardLight;
    private float touchPadDiagonal;

    public KeyboardAndTouchpad(boolean numPad, boolean keyboardLight, float touchPadDiagonal) {
        this.numPad = numPad;
        this.keyboardLight = keyboardLight;
        this.touchPadDiagonal = touchPadDiagonal;
    }
}
