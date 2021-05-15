package service.keyboardAndTouchpad;

import model.keyboardAndTouchpad.KeyboardAndTouchpad;

import java.util.List;

public interface KeyboardAndTouchpadService {
    KeyboardAndTouchpad findKeyboardAndTouchpad(int id);
    KeyboardAndTouchpad saveKeyboardAndTouchpad(KeyboardAndTouchpad keyboardAndTouchpad);
    KeyboardAndTouchpad deleteKeyboardAndTouchpad(KeyboardAndTouchpad keyboardAndTouchpad);
    KeyboardAndTouchpad updateKeyboardAndTouchpad(KeyboardAndTouchpad keyboardAndTouchpad);
    List<KeyboardAndTouchpad> getAllKeyboardAndTouchpads();
}
