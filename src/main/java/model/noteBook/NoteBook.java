package model.noteBook;

import lombok.Data;
import lombok.EqualsAndHashCode;
import model.computer.Computer;
import model.display.Display;
import model.keyboardAndTouchpad.KeyboardAndTouchpad;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
public class NoteBook extends Computer {
    @OneToOne(cascade = CascadeType.ALL)
    private Display display;
    @OneToOne(cascade = CascadeType.ALL)
    private KeyboardAndTouchpad keyboardAndTouchpad;
    private int batterySize;
}
