package Object____Practice;


import java.util.Scanner;

public class Mobile_Application_TEST{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mobile_Aplication phone = new Mobile_Aplication();
        System.out.println("Welcome to your contact list application");
        System.out.println("please enter your name");
        String name=input.next();
        phone.personName=name;
        System.out.println("please enter your passcode");
        String code1= input.next();
        phone.login("1234");
        int exit=0;
       do {
           phone.instructions();
           System.out.println("what instruction you want?");
           int steps = input.nextInt();
           switch (steps){
               case 1:
                   System.out.println("enter your passcode");
                   String code =input.next();
                   phone.login(code);
                   break;
               case 2:
                  phone.listOfContacts();
                  break;
               case 3:
                   System.out.println("please add contact, enter name first");
                   String addName = input.next();
                   System.out.println("enter phone number");
                   String addPhoneNumber = input.next();
                   phone.addContacts(addName,addPhoneNumber);
                   break;

               case 4:
                   System.out.println("please enter old name");
                   String oldName = input.next();
                   System.out.println("please enter your new name");
                   String newName=input.next();
                   phone.updateContacts(oldName,newName);
                   break;
               case 5:
                   System.out.println("enter your old number");
                   String oldPhoneNum =input.next();
                   System.out.println("please enter new number");
                   String newNum = input.next();
                   phone.updatePhoneNum(oldPhoneNum,newNum);
                   break;
                case 6:
                    System.out.println("please enter the name to remove from contact list");
                    String removeName=input.next();
                    phone.removeContacts(removeName);
                    break;
               case 7:
                   System.out.println("please enter phone number");
                   String phoneNum = input.next();
                   System.out.println(phone.searchPhone(phoneNum));
                   break;
               case 8:
                   System.out.println("please enter name to search");
                   String searchingName = input.next();
                   System.out.println(phone.searchName(searchingName));
                   break;
               case 9:
                   exit=9;
                   break;
           }




       }while (exit!=9);
        System.out.println("Thank you for using the Phone");















    }
}
