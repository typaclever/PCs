package service.keyboardAndTouchpad.impl;

import lombok.Data;
import lombok.NonNull;
import model.keyboardAndTouchpad.KeyboardAndTouchpad;
import repository.keyboardAndTouchpad.KeyboardAndTouchpadRepository;
import service.keyboardAndTouchpad.KeyboardAndTouchpadService;

import java.util.List;

@Data
public class KeyboardAndTouchpadServiceImpl implements KeyboardAndTouchpadService {
    @NonNull
    private KeyboardAndTouchpadRepository keyboardAndTouchpadRepository;

    @Override
    public KeyboardAndTouchpad findKeyboardAndTouchpad(int id) {
        return keyboardAndTouchpadRepository.findById(id);
    }

    @Override
    public KeyboardAndTouchpad saveKeyboardAndTouchpad(KeyboardAndTouchpad keyboardAndTouchpad) {
        return keyboardAndTouchpadRepository.save(keyboardAndTouchpad);
    }

    @Override
    public KeyboardAndTouchpad deleteKeyboardAndTouchpad(KeyboardAndTouchpad keyboardAndTouchpad) {
        return keyboardAndTouchpadRepository.delete(keyboardAndTouchpad);
    }

    @Override
    public KeyboardAndTouchpad updateKeyboardAndTouchpad(KeyboardAndTouchpad keyboardAndTouchpad) {
        return keyboardAndTouchpadRepository.update(keyboardAndTouchpad);
    }

    @Override
    public List<KeyboardAndTouchpad> getAllKeyboardAndTouchpads() {
        return keyboardAndTouchpadRepository.getAll();
    }
}
