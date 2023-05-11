package web.model;

import java.util.Objects;

public class Car {

    private Long id;
    private String model;
    private Long series;

    public Car(Long id, String model, Long series) {
        this.id = id;
        this.model = model;
        this.series = series;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Long getSeries() {
        return series;
    }

    public void setSeries(Long series) {
        this.series = series;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Objects.equals(getId(), car.getId()) && Objects.equals(getModel(), car.getModel()) && Objects.equals(getSeries(), car.getSeries());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getModel(), getSeries());
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", series='" + series + '\'' +
                '}';
    }
}
