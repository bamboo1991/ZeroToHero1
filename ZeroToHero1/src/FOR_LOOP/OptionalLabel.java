package FOR_LOOP;
public class OptionalLabel {
    public static void passingData(String [] [] values){
        outtter: for (int i =0; i< values.length; i++){
            inner: for (int k=0; k<values[i].length; k++){
                if (values[i][k].equalsIgnoreCase("Lee")){
                    break; }
                System.out.println(values[i][k]);}}}
public static void practice(String [] [] values){
        outter: for (int i =0; i<values.length; i++){
    inner: for (int k=0; k<values[i].length; k++){
            if (values[i][k].equalsIgnoreCase("sugar")){
                break outter;
            }
        System.out.println(values[i][k]);
    }
        }
}
        public void printA(){
        System.out.println("A");
    }
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
       String [] names = {"Ariet", "baha", "meka"};
        outter:
        for (int i=0; i<names.length; i++){
            innner:
            for (int k=0; k<names[i].length(); k++){
                if (names[i].charAt(k)=='i'){
                    break outter;
                }
                System.out.println(names[i].charAt(k)+",");
            }
            System.out.println();
        }


    }

    }

