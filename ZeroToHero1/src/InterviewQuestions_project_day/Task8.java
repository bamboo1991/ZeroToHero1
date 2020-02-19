package InterviewQuestions_project_day;

public class Task8 {
public void palindrom(String str){
    String original = str;
    String reversed =  "";
    for (int i=str.length()-1; i>=0; i--) {
        reversed += str.charAt(i);
    }if (original.equals(reversed)){
        System.out.println("p");
    }else
        System.out.println("not p");



}

    public static void main(String[] args) {
        new Task8().palindrom("tot");
    }
}
