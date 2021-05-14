package model.smartPhone;

import lombok.Data;
import lombok.EqualsAndHashCode;
import model.computer.Computer;
import model.connection.Connection;
import model.display.Display;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class SmartPhone extends Computer {
    @OneToOne(cascade = CascadeType.ALL)
    private Display display;
    @OneToOne(cascade = CascadeType.ALL)
    private Connection connection;
    private int batterySize;
}
