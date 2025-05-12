package exceptionhandling.q9;

public class UserController {
    private UserService userService = new UserService();

    public void handleRequest(){
        try{
            String user = userService.getUser();
            System.out.println("User: " + user);
        }catch(ServiceLayerException e){
            System.err.println("Controller caught error: " + e.getMessage());
            System.err.println("Root cause: " + e.getCause().getMessage());
        }
    }
}