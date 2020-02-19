package HomeWork;

public class BobsSalary {
    public static void main(String[] args) {
       int salary = 400000;
        int bonus1 = salary*50/100*5/100;
        int bonus2 = salary*30/100*8/100;
        int bonus3 = salary*20/100*10/100;
        int totalbonus = bonus1+bonus2+bonus3;
        System.out.println("this is total bonus amount: $" +totalbonus);


    }
}
