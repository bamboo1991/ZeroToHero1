package ScannerPractice;

import java.util.Scanner;

public class DDGJSDGA {
    public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 System.out.println("Please provide full name with middle name");
 String value = input.nextLine();
 //=====================================
            char firstName = value.charAt(0);
            int spaceInTheMiddleName = value.indexOf(" ");
            char firstLettterInTheMiddleName = value.charAt(++spaceInTheMiddleName);
            int spaceAfterMiddleName = value.indexOf(" ");
            char firstLetterInTheLastName = value.charAt(++spaceAfterMiddleName);
            String actaulFirstName = ""+firstName;
            String actaulMiddleName = ""+firstLettterInTheMiddleName;
            String actaulLastName = ""+firstLetterInTheLastName;

           String reqFirstName=actaulFirstName.toUpperCase();
            String reqMiddleName=actaulMiddleName.toUpperCase();
            String reqLastName = actaulLastName.toUpperCase();
            boolean results = reqFirstName.equals(actaulFirstName)&&reqMiddleName.equals(actaulMiddleName)&&reqLastName.equals(actaulLastName);
            System.out.println(results);








/*
Scanner input1 = new Scanner(System.in);
        System.out.println("please enter your full name");
        String value = input1.nextLine();
       //===============================================
        char firstName = value.charAt(0);
        int indexOfNumber = value.indexOf(" ");
        char lastName = value.charAt(++indexOfNumber);
        //================================================
        String actualFirstLetter = ""+firstName;
        String actualLastLetter = ""+lastName;
//==================================================================
        String expectedFirstname = actualFirstLetter.toUpperCase();
        String expectedLastName = actualLastLetter.toUpperCase();
        //=========================================================
        boolean result = actualFirstLetter.equals(expectedFirstname)&&actualLastLetter.equals(expectedLastName);
        System.out.println(result);
//===============================================================================
*/
    }
}
