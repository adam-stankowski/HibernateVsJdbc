package as.hibernate.dao;

import as.hibernate.model.Car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CarDaoImpl implements CarDao {
    private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hibernatePlayground");

    private static EntityManager createEntityManager() {
        return entityManagerFactory.createEntityManager();
    }

    @Override
    public Car getById(Long id){
        EntityManager entityManager = createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        Car car = entityManager.find(Car.class, id);

        transaction.commit();
        entityManager.close();

        return car;
    }
}
