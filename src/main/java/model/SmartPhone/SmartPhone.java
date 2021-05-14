package model.SmartPhone;

import lombok.Data;
import lombok.EqualsAndHashCode;
import model.Computer.Computer;
import model.Connection.Connection;
import model.Display.Display;

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
