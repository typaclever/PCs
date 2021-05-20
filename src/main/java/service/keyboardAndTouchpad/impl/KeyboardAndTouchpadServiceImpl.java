package service.keyboardAndTouchpad.impl;

import Exeptions.keyboardAndTouchpad.KeyboardAndTouchpadDeleteException;
import Exeptions.keyboardAndTouchpad.KeyboardAndTouchpadUpdateException;
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
        try {
            return keyboardAndTouchpadRepository.delete(keyboardAndTouchpad);
        } catch (KeyboardAndTouchpadDeleteException e) {
            e.printStackTrace();
        }
        return keyboardAndTouchpad;
    }

    @Override
    public KeyboardAndTouchpad updateKeyboardAndTouchpad(KeyboardAndTouchpad keyboardAndTouchpad) {
        try {
            return keyboardAndTouchpadRepository.update(keyboardAndTouchpad);
        } catch (KeyboardAndTouchpadUpdateException e) {
            e.printStackTrace();
        }
        return keyboardAndTouchpad;
    }

    @Override
    public List<KeyboardAndTouchpad> getAllKeyboardAndTouchpads() {
        return keyboardAndTouchpadRepository.getAll();
    }
}
