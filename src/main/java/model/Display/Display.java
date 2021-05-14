package model.Display;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Data
@Entity
public class Display {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private float diagonal;
    private String resolution;
    private String matrix;
    private int brightness;
}
