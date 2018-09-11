package as.jdbc.dao;

import as.jdbc.model.Car;

import java.sql.*;

public class CarJdbcDaoImpl implements CarJdbcDao {
    private static final String SELECT_CARS_QUERY = "SELECT * FROM Car WHERE id=?";
    private static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/hibernate_playground?user=hibernate_user&password=hibernatePassword&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false";

    @Override
    public Car getById(Long id) {
        Car car = null;
        try (Connection connection = DriverManager.getConnection(CONNECTION_STRING);
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CARS_QUERY)) {

            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                car = new Car();
                car.setId(resultSet.getLong(1));
                car.setMake(resultSet.getString(2));
                car.setModel(resultSet.getString(3));
                Date manufacturingDate = resultSet.getDate(4);
                car.setManufacturedAt(manufacturingDate != null ? manufacturingDate.toLocalDate() : null);
            }
        } catch (SQLException e) {
            System.out.println("Error retrieving from the database " + e.getMessage());
            throw new RuntimeException(e);
        }

        return car;
    }
}
