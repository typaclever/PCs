package someModels.Display;

import lombok.Data;

import javax.persistence.*;

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
