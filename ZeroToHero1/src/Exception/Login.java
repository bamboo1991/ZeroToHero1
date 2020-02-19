package Exception;



import java.util.Scanner;

public class Login {
    public static final String USERNAME;
    public static final String PASSWROD;
    static {
        USERNAME="Techtorial";
        PASSWROD="123456";
    }

    public static void myMethod() throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your UserName");
        String enteredUserName = input.next();
        System.out.println("please enter your password");
        String enteredPassword = input.next();
        Login login = new Login();
        if (!enteredUserName.equalsIgnoreCase(Login.USERNAME)) {
            throw new Exception("UserName is not matching "+enteredUserName);
        }
        if (!enteredPassword.equals(login.PASSWROD)) {
            throw new Exception("Password is not matching" +enteredPassword);
    }
        System.out.println("welcome to the application");
    }
    public static void main(String[] args) throws Exception{
        try {
            myMethod();
        }catch (Exception e){
            System.out.println(e.getMessage());
            throw e;
        }catch (Throwable t){
            System.out.println("Throwing Throwable or subclass exception");

        }finally {
            System.out.println("In Finally block");
        }
    }


}
