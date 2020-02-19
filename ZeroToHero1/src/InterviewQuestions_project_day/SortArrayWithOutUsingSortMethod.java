package InterviewQuestions_project_day;
import Mentoring.Array;

import java.util.Arrays;
public class SortArrayWithOutUsingSortMethod {
public void sort(int [] num){
    for (int i=0; i<num.length; i++){
        for (int j =i+1; j<num.length; j++){
            if (num[i]>num[j]){
                int a = num[i];
                num[i]=num[j];
                num[j]=a;
            }
        }
    }
    System.out.println(Arrays.toString(num));
}

    public static void main(String[] args) {
    int [] numbers = {2,3,444,55,122,434,1};
        new SortArrayWithOutUsingSortMethod().sort(numbers);
    }


}