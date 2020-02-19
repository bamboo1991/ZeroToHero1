package ConditionStatements;

public class ConditionStement {
    public static void main(String[] args) {
        int currentSpeed =50;
        int speedlimit=70;
        boolean increaseSpeed=currentSpeed<speedlimit;
        boolean decraseSpeed=currentSpeed>speedlimit;
        System.out.println(increaseSpeed);
        System.out.println(decraseSpeed);
        //task
        /*
        room temperature 75,
        room expectedTemp=72;
        check two increase temp

         */ int roomtemp =75;
         int expectedTemp = 72;
         boolean increasTmep = roomtemp<expectedTemp;
         boolean decreaseTnep = roomtemp>expectedTemp;
        System.out.println(" can i increase " + increasTmep);
        System.out.println("shoud in decrease " + decreaseTnep);
    }
}
