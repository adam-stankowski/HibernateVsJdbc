package as.jdbc.dao;

import as.jdbc.model.Car;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CarJdbcDaoImplTest {
    private CarJdbcDao carJdbcDao;

    @Before
    public void setUp() {
        carJdbcDao = new CarJdbcDaoImpl();
    }

    @Test
    public void havingIdExistsWhenGetSingleThenCarReturned() {
        Car car = carJdbcDao.getById(1L);
        Assert.assertNotNull(car);
    }

}