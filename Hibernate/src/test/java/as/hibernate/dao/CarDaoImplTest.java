package as.hibernate.dao;

import as.hibernate.model.Car;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarDaoImplTest {
    private CarDao carDao;

    @Before
    public void setUp() {
        carDao = new CarDaoImpl();
    }

    @Test
    public void havingIdExistsWhenGetSingleThenCarReturned() {
        Car car = carDao.getById(1L);
        Assert.assertNotNull(car);
    }
}