package ConditionStatements;

public class Saturday_task {
    static int staticV;
    int variable1;
    int variable2;
    public Saturday_task(int variable1, int variable2) {
        this.variable1 = variable1;
        this.variable2 = variable2;
    }
    static {
        staticV=3;
    }

    public static void main(String[] args) {
        Saturday_task static1 = new Saturday_task(5,6); //static1.variable1=5,,,
                                                            // static2.variables=6;,
        //                                                       var1.staticV =3;
                                                                 //   var2.staticV=3;
                                                                //
        Saturday_task static2 = new Saturday_task(10,12);
        static2.staticV=11;

        static1.variable1=static1.variable2+static1.staticV; // 6+11=17;
        static1.staticV=static2.variable2+static2.staticV; // 12+11=23;
        static2.variable1=static1.variable1+static2.staticV; // 17+23=40;

        System.out.println(static1.variable1);
        System.out.println(static1.staticV);
        System.out.println(static2.variable1);
        System.out.println(static2.staticV);
    }



}
