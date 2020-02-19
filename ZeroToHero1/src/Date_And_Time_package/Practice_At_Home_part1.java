package Date_And_Time_package;

import java.util.HashSet;
import java.util.Set;

public class Practice_At_Home_part1 {
   String name;
   String workPlace;

   public String toString(){
       return "the name of the friend is: "+name+ " and he/she works at "+workPlace;
   }
   public Practice_At_Home_part1(String name, String workPlace){
       this.name=name;
       this.workPlace=workPlace;
   }

    public static void main(String[] args) {
        Practice_At_Home_part1 fr1 = new Practice_At_Home_part1("Baha", "Ipsoft ");
        Practice_At_Home_part1 fr2 = new Practice_At_Home_part1("Areit", "sybertec");
        Practice_At_Home_part1 fr3 = new Practice_At_Home_part1("Aiba", "Bank of America");
        Practice_At_Home_part1 fr4 = new Practice_At_Home_part1("Sandu", "Chase");

        Set<Practice_At_Home_part1> newList = new HashSet<>();
        newList.add(fr1);
        newList.add(fr2);
        newList.add(fr3);
        newList.add(fr4);

        for (Practice_At_Home_part1 i : newList){
            System.out.println(i.toString());
        }
        for (Practice_At_Home_part1 b:newList){
            if (b.name.startsWith("B")){
                System.out.println(b.name+" works at "+ b.workPlace);
            }
        }
    }


}
