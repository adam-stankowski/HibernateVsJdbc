package as.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "Car", schema = "hibernate_playground")
public class Car {
    private Long id;
    private String make;
    private String model;
    private LocalDateTime manufacturedAt;

    @Id
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "make")
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Column(name = "model")
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Column(name = "manufactured_at")
    public LocalDateTime getManufacturedAt() {
        return manufacturedAt;
    }

    public void setManufacturedAt(LocalDateTime manufacturedAt) {
        this.manufacturedAt = manufacturedAt;
    }
}

