package as.hibernate.dao;

import as.hibernate.model.Car;

public interface CarDao {
    Car getById(Long id);
}
