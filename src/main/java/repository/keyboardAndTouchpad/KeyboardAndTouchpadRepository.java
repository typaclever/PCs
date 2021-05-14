package repository.keyboardAndTouchpad;

import model.KeyboardAndTouchpad.KeyboardAndTouchpad;

public interface KeyboardAndTouchpadRepository {
    void save(KeyboardAndTouchpad keyboardAndTouchpad);
    void update(KeyboardAndTouchpad keyboardAndTouchpad);
    void delete(KeyboardAndTouchpad keyboardAndTouchpad);
    KeyboardAndTouchpad findById(int id);
}
