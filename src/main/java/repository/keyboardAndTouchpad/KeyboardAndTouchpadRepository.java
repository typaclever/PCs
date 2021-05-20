package repository.keyboardAndTouchpad;

import Exeptions.keyboardAndTouchpad.KeyboardAndTouchpadDeleteException;
import Exeptions.keyboardAndTouchpad.KeyboardAndTouchpadUpdateException;
import model.keyboardAndTouchpad.KeyboardAndTouchpad;

import java.util.List;

public interface KeyboardAndTouchpadRepository {
    KeyboardAndTouchpad save(KeyboardAndTouchpad keyboardAndTouchpad);
    KeyboardAndTouchpad update(KeyboardAndTouchpad keyboardAndTouchpad) throws KeyboardAndTouchpadUpdateException;
    KeyboardAndTouchpad delete(KeyboardAndTouchpad keyboardAndTouchpad) throws KeyboardAndTouchpadDeleteException;
    KeyboardAndTouchpad findById(int id);
    List<KeyboardAndTouchpad> getAll();
}
