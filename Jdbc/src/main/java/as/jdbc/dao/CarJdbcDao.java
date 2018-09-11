package as.jdbc.dao;

import as.jdbc.model.Car;

public interface CarJdbcDao {
    Car getById(Long id);
}
