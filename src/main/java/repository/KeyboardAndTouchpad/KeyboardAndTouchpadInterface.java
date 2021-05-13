package repository.KeyboardAndTouchpad;

import someModels.KeyboardAndTouchpad.KeyboardAndTouchpad;

public interface KeyboardAndTouchpadInterface {
    void save(KeyboardAndTouchpad keyboardAndTouchpad);
    void update(KeyboardAndTouchpad keyboardAndTouchpad);
    void delete(KeyboardAndTouchpad keyboardAndTouchpad);
    KeyboardAndTouchpad findById(int id);
}
