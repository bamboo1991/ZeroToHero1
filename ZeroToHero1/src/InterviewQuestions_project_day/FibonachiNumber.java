package InterviewQuestions_project_day;

import org.w3c.dom.ls.LSOutput;

public class FibonachiNumber {
  public void FidonachiNum(int num){
      int preNum=0;
      int nextNum=1;
      int sum=0;
      for (int i=1; i<num; i++){
          if (preNum<num){
          }
          System.out.println(preNum+"");
          sum=preNum+nextNum;
          preNum=nextNum;
          nextNum=sum;
      }
      System.out.println(preNum);
  }

    public static void main(String[] args) {
        new FibonachiNumber().FidonachiNum(23);
    }
}
