package DoWhile;

import java.util.Scanner;

public class Password_UserName_homework {
    public static void main(String[] args)throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your username");
        String enteredUserName = input.nextLine();
        System.out.println("Please enter your password");
        String enteredPassword = input.nextLine();
        String actualUserName = "ariet1991";
        String actualPassword = "techtorial2019";
        int youCanTry = 3;

boolean result1 = enteredUserName.equals(actualUserName)&&enteredPassword.equals(actualPassword);
boolean result2 = enteredUserName.equals(enteredUserName)&&enteredPassword.equals(enteredPassword);
        do {
            if (result1){
                System.out.println("you are logged in to your account");
            } else
                System.out.println("you did not enter correct userName and password");
              }while (result1);


    }}



