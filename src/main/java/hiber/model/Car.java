package hiber.model;


import org.springframework.stereotype.Component;
import hiber.model.User;
import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private int series;

    @Column
    private String model;

    @OneToOne(mappedBy = "car", cascade = CascadeType.ALL)
    private User user;

    public Car(){

    }

    public Car(int series, String model) {
        this.series = series;
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public String getModel() {
        return model;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
