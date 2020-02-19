package Object____Practice;

public class Soccer_Player {
    String firstName;
    int age;
    char gender;
    String position;
    String team;
    int totalDistance;


    public void run(){
        System.out.println( firstName+" is running");
        if (totalDistance>=3){
            totalDistance=totalDistance-3;
        }else if(totalDistance<3&&totalDistance>0){
            System.out.println(firstName+ " is running slowly");
        }else{
            System.out.println(firstName+ " cannot run anymore");
        }


    }
    public int shoot(){
        int shoot = 35;
        System.out.println(" the speed of the shoot is: " +shoot+ " mph");
        return shoot;
    }
    public void pass(){
        System.out.println(" give a pass");
    }


    public static void main(String[] args) {





    }



}
