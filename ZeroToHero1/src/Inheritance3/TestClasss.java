package Inheritance3;

public class TestClasss {
    public static void main(String[] args) {
        HR_under_the_Company hr = new HR_under_the_Company("Google");
        System.out.println(hr.isHiring());
        System.out.println(hr.companyName);
    IT_DEPT it = new IT_DEPT("FaceBook");
        System.out.println(it.progress());
    }

}
