package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "test.userCar")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "userCar", cascade = CascadeType.ALL)
    private User user;

    @Column(name = "model")
    private String model;

    @Column(name = "series")
    private int series;

    public Car() {
    }

    public Car(Long id, User user, String model, int series) {
        this.id = id;
        this.user = user;
        this.model = model;
        this.series = series;
    }



    public Car(String model, int series) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", user=" + user +
                ", model='" + model + '\'' +
                ", series=" + series +
                '}';
    }




}
