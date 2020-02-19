package TernaryOperaotr;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your student number");
        int studentNumber = input.nextInt();
        switch (studentNumber){
            case 123:
                System.out.println("you name is Muammer");
                String value = input.next();
                System.out.println("waht is your last name");
                String lastName = "Turan";
                if(value=="Turan"){
                    System.out.println("your last name is Turan");
                    break;
                }
            case 223:
                System.out.println("your name is Arslan");
                System.out.println("what is your age? ");
                int value2 = input.nextInt();
                int age = 22;
                if(age==22){
                    System.out.println("your age is not correct");
                    break;
                }
            case 456:
                System.out.println("where do you live?");
                String City = input.next();
                if (City.equalsIgnoreCase("chicago"));
                System.out.println("i live in great city");
                break;
        }

    }
}
