package as.hibernate.dao;

import as.hibernate.model.Car;

public interface CarHibernateDao {
    Car getById(Long id);
}
