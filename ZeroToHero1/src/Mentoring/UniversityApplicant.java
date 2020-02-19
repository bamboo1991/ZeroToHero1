package Mentoring;

import java.util.ArrayList;

public class UniversityApplicant {
    String firstName;
    String lastName;
    String ddf;
    int score;
    ArrayList list =new ArrayList();
    public UniversityApplicant(String firstName, String lastName, String ddf, int score) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ddf = ddf;
        this.score = score;
    }
    UniversityApplicant(){

    }
    public ArrayList addApplicant(UniversityApplicant universityApplicant){
        list.add(universityApplicant);
        return list;
    }
    public String toString(){
        return firstName +" "+lastName+" "+ddf+" "+score;
    }
}
