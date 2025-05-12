package exceptionhandling.q9;

import java.sql.SQLException;

public class UserService {
    private UserRepository repository = new UserRepository();

    public String getUser() throws ServiceLayerException {
        try{
            return repository.fetchUser();
        }catch(SQLException e){
            throw new ServiceLayerException("Failed to get user form service layer", e);
        }
    }

}
