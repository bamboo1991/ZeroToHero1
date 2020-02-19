package Constructor_PRACTICE;

public class Job_Test{
    public static void main(String[]args) {
        Job job1 = new Job();
        Job job2 = new Job("SDET", 100000,"Chicago");
        String job1Title = job1.jobTitle;
        String job2Title = job2.jobTitle;
    System.out.println(job1Title);
    System.out.println(job2Title);

    }
}



