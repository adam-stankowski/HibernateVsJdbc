package as.hibernate.dao;

import as.hibernate.model.Car;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CarDaoImplTest {
    private CarHibernateDao carHibernateDao;

    @Before
    public void setUp() {
        carHibernateDao = new CarHibernateDaoImpl();
    }

    @Test
    public void havingIdExistsWhenGetSingleThenCarReturned() {
        Car car = carHibernateDao.getById(1L);
        Assert.assertNotNull(car);
    }
}