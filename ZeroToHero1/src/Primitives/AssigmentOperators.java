package Primitives;

public class AssigmentOperators {
    public static void main(String [] args){
        int cows = 34;
        int chicken = 42;
        int totalNumberOfAnimals = cows+chicken;
        System.out.println(totalNumberOfAnimals);
        int legsOfChicken = chicken*2;
        int cowLegs = cows*4;
        int totalNumberOfLegs = legsOfChicken+cowLegs;
        System.out.println(totalNumberOfLegs);
        double costOfOneCows = 2000;
        double costOfOneChicken = 55;
        double totalCostOfCows = cows*costOfOneCows;
        double totalCostOfChicken = chicken*costOfOneChicken;
        System.out.println("this is total cost for chicken " + totalCostOfChicken);
        System.out.println("this is total cost for cows " + totalCostOfCows);
        double totalanimalcost = totalCostOfChicken+totalCostOfCows;
        System.out.println("this is cost of all animals "+"$"+ totalanimalcost);
    }
}
