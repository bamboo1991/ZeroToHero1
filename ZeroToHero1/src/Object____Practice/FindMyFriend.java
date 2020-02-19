package Object____Practice;

import java.util.Arrays;

public class FindMyFriend {
    String firstName;
    String LastName;
    int age;
    String livingArea;
    String workPlace;
    String graduatedAt;
    String graduatedDate;
    String familyStatus;
    int friends;
    int commonFriends;
    String userName;
    String password;
    boolean isLogin;
    String webSite;
    String lastVisit;
    String [] friendNamesAre = new String[10];
    //=================================================================================================================
    //=================================================================================================================
    public void webAddress(){
        String site = "www.bestCom.com";
        System.out.println(site);
    }
    public void displayYourInfo(){
        System.out.println("Friends names is: "+firstName);
        System.out.println("Friends last name is: "+LastName);
        System.out.println("age is: "+age);
        System.out.println("Live in "+livingArea);
        System.out.println("Work at "+workPlace);
        System.out.println("Graduated from "+graduatedAt);
        System.out.println("Graduated in "+graduatedDate);
        System.out.println("Family status "+familyStatus);
        System.out.println("What WebSite? "+webSite);
        System.out.println("last visit "+lastVisit);
    }
    public void listOfFriends(){
for (int i=0; i<=friendNamesAre.length; i++) {
    System.out.println("number of friends");
    System.out.println(friends);
    System.out.println("List of friends " + friendNamesAre[i]);

    System.out.println("you have common friends "+commonFriends);
}
    }

    public static void main(String[] args) {
        FindMyFriend myPage = new FindMyFriend();
        myPage.displayYourInfo();
        myPage.listOfFriends();
    }

}
