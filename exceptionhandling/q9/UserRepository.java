package exceptionhandling.q9;

import java.sql.SQLException;

public class UserRepository {
    public String fetchUser() throws SQLException {
        throw new SQLException("Database connection failed in repository");
    }
}
