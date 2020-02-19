package HomeWork;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" What is your Grade in Java class? ");
        int gradeInJava = input.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Please enter your Grade for Soft skill class? ");
        int gradeInSoftSkill = input2.nextInt();
        Scanner input3 = new Scanner(System.in);
        System.out.println("What is your attendance rate? ");
        int attendance = input3.nextInt();
        int averageGrade = (gradeInJava + gradeInSoftSkill) / 2;
        if (averageGrade >= 60 && attendance >= 80) {
            System.out.println(" PASSED! You got an average " + averageGrade + " and your attendance is " + attendance);
        } else if(averageGrade<=60&&attendance<=80){
            System.out.println(" FAILED! Your grade: " + averageGrade + " and attendance was " + attendance);
        }else if (averageGrade >= 40 && averageGrade <= 60 && attendance >= 90){
                System.out.println("Passed! Your average grade:" + averageGrade + " average attendance" + attendance);
            }else if(attendance>=90&&attendance==100){
            System.out.println("Passed! You have highest attandace rate "+attendance);
        }


        }


    }
