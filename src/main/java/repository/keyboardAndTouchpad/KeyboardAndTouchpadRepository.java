package repository.keyboardAndTouchpad;

import model.keyboardAndTouchpad.KeyboardAndTouchpad;

import java.util.List;

public interface KeyboardAndTouchpadRepository {
    KeyboardAndTouchpad save(KeyboardAndTouchpad keyboardAndTouchpad);
    KeyboardAndTouchpad update(KeyboardAndTouchpad keyboardAndTouchpad);
    KeyboardAndTouchpad delete(KeyboardAndTouchpad keyboardAndTouchpad);
    KeyboardAndTouchpad findById(int id);
    List<KeyboardAndTouchpad> getAllKeyboardAndTouchpads();
}
