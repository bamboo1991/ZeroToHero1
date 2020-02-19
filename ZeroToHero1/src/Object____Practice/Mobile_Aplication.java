package Object____Practice;

import java.util.Scanner;

public class Mobile_Aplication {
    String modelOfYourPhone;
    String personName;
    String  userPasscode = "1234";
    String[] contactList = new String[10];
    String[] phoneNumbers =new String[10];
    boolean isLogin;


public void model(){
    String model= "One Pluss 6T";
    System.out.println(model);
}
public void listOfContacts(){
    for (int i =0; i<contactList.length;i++){
        System.out.println(contactList[i]+ " -----> "+phoneNumbers[i]);
    }
}
public boolean addContacts(String addName, String addPhoneNumber){
    boolean isAdded=false;
    for (int i=0; i<contactList.length;i++){
        if(contactList[i]==null){
         contactList[i]=addName;
         phoneNumbers[i]=addPhoneNumber;
         isAdded=true;
         break;
     }
 }
 return isAdded;
}
public void updateContacts(String oldName, String newName) {
for (int i =0; i<contactList.length;i++) {
    if (contactList[i].equals(oldName)) {
        contactList[i] = newName;
        System.out.println(contactList[i]+" -------> "+ newName);
        break;
    }
}
}
public void updatePhoneNum(String oldPhoneNum, String newNum) {
    for (int i = 0; i < phoneNumbers.length; i++) {
        if (phoneNumbers[i].equals(oldPhoneNum)) {
            phoneNumbers[i]=newNum;
            System.out.println(phoneNumbers[i]+ "------->"+newNum);
            break;
        }
    }
}
public boolean removeContacts(String removeName) {
    boolean isRemoved = false;
    for (int i = 0; i < contactList.length; i++) {
        if (contactList[i].equals(removeName)) {
            contactList[i] = null;
            isRemoved = true;
            break;
        }
    }
    return false;
}
public String searchPhone(String phoneNum){
    for (int i=0; i<phoneNumbers.length; i++){
        if (phoneNumbers[i].equals(phoneNum)){
            return contactList[i];
        }
    }return null;
}
public String searchName(String searchingName){
for (int i=0; i<contactList.length;i++){
    if (contactList[i].equals(searchingName)){
        return phoneNumbers[i];
    }
}return null;
}
public boolean login(String code){
    boolean isLogin = false;
    if (userPasscode.equals(code)){
        System.out.println("welcome!!! " +personName);
        isLogin=true;
        return isLogin;
    }
    return isLogin;
}
public void instructions(){
    System.out.println("to be able to login press 1");
    System.out.println("to be able to print all contacts press 2");
    System.out.println("to be able to add new contacts press 3");
    System.out.println("to be able to update existing contact press 4");
    System.out.println("to be able to update phone number press 5");
    System.out.println("to be able to remove contact press 6");
    System.out.println("to be able to search with phone number press 7");
    System.out.println("to be able to search with name press 8");
    System.out.println("to Exist press 9");

}
}