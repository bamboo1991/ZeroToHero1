package ProjectMusicBox;

import java.util.Scanner;

public class MusicBox {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println(" Please enter the music type from list \nPop music \nClassical music \nCountry music");
        String musicType1 = input.nextLine().trim();
        if (musicType1.equalsIgnoreCase("classical music")) {
            System.out.println("Choose one of this songs \nFourSeasons,\nFurElise,\nFinlandia,\nVocalise,\nThe Planets is available music under Classical music");
            String songName = input.nextLine().trim();
            if(songName.equalsIgnoreCase("FourSeasons")||songName.equalsIgnoreCase("FurElise")||songName.equalsIgnoreCase("Vocalise")||songName.equalsIgnoreCase("The Planets is available music under Classical music")){
                System.out.println("Please enter the $2 for this music");
                int priceOfClassical = input.nextInt();
                int classicalMusicPrice, countryMusicPrice;
                classicalMusicPrice=2;
                if(priceOfClassical<classicalMusicPrice){
                    System.out.println("" +priceOfClassical+ "$ is not enough please try later");
                }else if(priceOfClassical==classicalMusicPrice){
                    System.out.println("enjoy with the music");
                }else if(priceOfClassical>classicalMusicPrice){
                    System.out.println("your change is  $" + (priceOfClassical-classicalMusicPrice) +" please wait for your change " + songName + " is playing");
                }
            }else{
                System.out.println(songName+ " is not found");
            }
        }else if(musicType1.equalsIgnoreCase("pop music")){
            System.out.println("Choose one i=of this songs \nbad guy, \ntalk, \nplease me, \n7 ring \nwithout me");
            String songName = input.nextLine().trim();
            if(songName.equalsIgnoreCase("bad guy")||songName.equalsIgnoreCase("talk")||songName.equalsIgnoreCase("please me")||songName.equalsIgnoreCase("7 ring")||songName.equalsIgnoreCase("without me")){
                System.out.println("Please enter the $4 for this music");
                int priceOfPop = input.nextInt();
                int popMusicPrice = 4;
                if(priceOfPop<4){
                    System.out.println(""+ priceOfPop+ "$ is not enough please try later");
                }else if(priceOfPop==4) {
                    System.out.println("enjoy with the music");
                }else if(priceOfPop>4){
                    System.out.println("your change is $"  + (priceOfPop-popMusicPrice) + " please wait for your change " + songName + " is playing");
                }
            }else {
                System.out.println(songName + " is not found");
            }
        }else if(musicType1.equalsIgnoreCase("country music")){
            System.out.println("choose one of this songs: \nMeant to be, \nHeaven \nSimple \nOne number away \nGet along");
            String songName = input.nextLine().trim();
            if(songName.equalsIgnoreCase("Meant to be")||songName.equalsIgnoreCase(" Heaven")||songName.equalsIgnoreCase("Simple")||songName.equalsIgnoreCase("One number away")||songName.equalsIgnoreCase("get along")){
                System.out.println("Please enter the $3 for this music");
                int priceOfCountryMusic = input.nextInt();
                int countryMusicPrice =3;
                if(priceOfCountryMusic<3){
                    System.out.println("" + priceOfCountryMusic+ "$ is not enough please try later");
                }else if(priceOfCountryMusic==3){
                    System.out.println("enjoy your music ");
                }else if(priceOfCountryMusic>3){
                    System.out.println("your change is $"  + (priceOfCountryMusic-countryMusicPrice) + " please wait for your change " + songName + " is playing");
                }
            }else {
                System.out.println(songName + " is not found");
            }
        }else{
            System.out.println(musicType1+  " is not available");
        }}}



