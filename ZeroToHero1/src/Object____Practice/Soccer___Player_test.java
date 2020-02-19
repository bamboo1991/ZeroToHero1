package Object____Practice;

public class Soccer___Player_test {
    public static void main(String[] args) {
        Soccer_Player player = new Soccer_Player();//// same class
        player.firstName = "Ariet";
        player.gender='M';
        player.position="wings";
        player.age=23;
        player.team="Barcelona";
        player.run();
        player.pass();
        player.totalDistance=11;

        int speed= player.shoot();
int shootDistance =25;
if (speed>=20&&shootDistance<30){
    System.out.println("it is goal");
}else{
    System.out.println("it is not goal");
}
        Soccer_Player player1 = new Soccer_Player();
player1.firstName= "Shermende";
player1.totalDistance=8;
player1.pass();
player1.shoot();
player1.run();

        System.out.println(player1.totalDistance);
        System.out.println(player.totalDistance);

    }

}
