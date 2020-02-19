package StringPractice;

import java.util.Scanner;

public class StringPractice1 {
    public static void main(String[] args) {
        String str = "Microphone";
        str=str.replace('o','a');
        System.out.println(str);
        String db = " jdk 13. 0. 1";
        String java = "jdk-13.0.1";
        java=java.replace("-"," ");
        System.out.println("are they equal? "+db.equals(java));
//NOTE: IF YOU TRY TO REPLACE THE VALUE WHICH IS NOT EXITS
        //IN THE STRING. IT WILL NOT THROW THE ERROR. SINCE, THERE IS NOT REPLCASEMENT VALUE, IT WILL NOT CHANGE ANYTHING.
        System.out.println(db);
        db=db.trim();

        System.out.println(db);
        System.out.println(db);
        String sName="  stamov ariet";
        sName=sName.trim();
        System.out.println(sName);

        Scanner input = new Scanner(System.in);
        System.out.println("please enter the 2 date woth folowing format: ");
        String date1 = input.next();
        String date2 = input.next();
        date1=date1.replace("/","-");


        System.out.println(date2.equals(date1));
    }
}
