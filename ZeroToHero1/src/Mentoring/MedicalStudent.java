package Mentoring;

public class MedicalStudent extends UniversityApplicant {
    String majorName="You are a doctor";
    int tuition=50000;
    public void medSStudent(UniversityApplicant universityApplicant){
        System.out.println(universityApplicant+" "+majorName+" "+tuition);
    }

    public static void main(String[] args) {
        UniversityApplicant applicant = new UniversityApplicant("Ariet", "Stamov","1998", 120);
        MedicalStudent medicalStudent = new MedicalStudent();
        applicant.ddf="1991";
        System.out.println(applicant);
        medicalStudent.addApplicant(applicant);

        for (Object var: medicalStudent.list){
            System.out.println("med faculty "+ var);
    }   }
}
