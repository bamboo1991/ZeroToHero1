package Object____Practice;

public class SatUrday_CLASS_TASK {
    String name;
    int age;
    String color;
    boolean isRunning;
    String kind;
    int speed =10;

    public boolean start(){
        if (isRunning==false){
            isRunning=true;
        }
       // speed=10;
    return isRunning;
    }

    public void stop(){
        isRunning=false;
      //  speed=0;
        }
        public void targetSpeed(int targetSpeed) {
            if (speed <targetSpeed){
               int currentSpeed =speed;
               while (currentSpeed<=targetSpeed){
                   System.out.print(currentSpeed+targetSpeed);
                   System.out.println();
                   currentSpeed++;
                }speed=currentSpeed;
            }
        }
        public void run(){
        start();
            System.out.println(name+" cat is running");
        }
        public void run(String destination){
        start();
            System.out.println(name+" cat is running. the destination is "+destination);
        }
        public void run(String destination, int totalDistance){
        start();
            System.out.println(name+ " is running and destination "+destination+" totalDistance is "+totalDistance);
    }
    public void run(int ... num){
        int indexNumber = num.length-1;
        System.out.println("last number of num is " +num[indexNumber]);
    }


public void displayInfo(){
    System.out.println("cat name is "+name);
    System.out.println("cat age is "+age);
    System.out.println("cat color is "+color);
    System.out.println("is cat running "+isRunning);
    System.out.println("cat speed "+speed);
    System.out.println("cat's type is "+kind);

    }

    public static void main(String[] args) {
        SatUrday_CLASS_TASK cat = new SatUrday_CLASS_TASK();
        cat.name="DOdo";
        cat.age=15;
cat.kind="Scotish";
cat.speed=10;
cat.color="black";
cat.start();
        cat.displayInfo();
        cat.stop();
        cat.displayInfo();
        //cat.run();
        cat.targetSpeed(20);
SatUrday_CLASS_TASK cat1 =new SatUrday_CLASS_TASK();
        cat1.name="Princess";
        cat1.age=04;
        cat1.kind="Scotish";
        cat1.speed=10;
        cat1.color="Pink ";

        cat1.run("chicago");
        cat1.run("NEW YORK ",1000 );
        cat1.displayInfo();
        cat1.run(1,2,3,4,5,6,767,8,8,9,9,9,90,0,0);
    }




}
