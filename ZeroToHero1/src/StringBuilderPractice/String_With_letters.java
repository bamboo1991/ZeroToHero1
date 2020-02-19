package StringBuilderPractice;

public class String_With_letters {
    public static void main(String[] args) {
        String str="";
        int count=0;
        for ( char i ='A'; i<='Z'; i++){
            str+=i;
count++;
        } System.out.println(str);
        System.out.println(count);


        // Example:
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(10);//10
        System.out.println(stringBuilder);stringBuilder.append(20);//1020
        System.out.println(stringBuilder);//1020
        stringBuilder.append(" is the number");
        System.out.println(stringBuilder);
//String is immutable, StringBuilder is mutable.
        //to change the value of StringBuilder object, Return type of method must be StringBuilder.
        StringBuilder builder  = new StringBuilder("Techtorial ");
        builder.append(2019+ " ").append(true);
        System.out.println(builder);

        StringBuilder builder1=new StringBuilder("Working Hard");
        builder1.append("in 2010");
        StringBuilder builder2=builder1.append("Summer");
        System.out.println(builder1);
        System.out.println(builder2);
        builder2.append(true).append(2.6);
        System.out.println(builder1);
        System.out.println(builder2);
        StringBuilder builder3=new StringBuilder("School");
        builder1=builder3;
        System.out.println(builder1);
        builder3=null;
        StringBuilder method = new StringBuilder("Computer");
        //String methods = "sdsad";
        //after charAt we can not use StringBuilder method.
        System.out.println(method.charAt(2)=='m');
        System.out.println(method.indexOf("r"));
        //System.out.println(method.charAt(3));
        System.out.println(method.length());
        System.out.println(method.substring(2));
        System.out.println(method.substring(2,7));

        // after substring method in stringBuilder we canot use append but we can use otehr string mehtodas.
        method.substring(4);
    }
}
