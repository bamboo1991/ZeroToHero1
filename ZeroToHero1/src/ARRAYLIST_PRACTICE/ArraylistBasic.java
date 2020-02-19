package ARRAYLIST_PRACTICE;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistBasic {
    public static void main(String[] args) {
        ArrayList bankCards = new ArrayList();
        bankCards.add("visa ");
        System.out.println(bankCards.get(0));
        System.out.println(bankCards.size());
        bankCards.add("MasterCard");
        System.out.println(bankCards.size());
        System.out.println(bankCards.get(1));
        bankCards.add("Amex");
        bankCards.add("Chase");
        bankCards.add(3,"Discovery");
        System.out.println(bankCards.get(3));
        System.out.println(bankCards);
        bankCards.set(3,"Bank of America");
        System.out.println(bankCards);
        bankCards.add(100);
        System.out.println(bankCards);
        for (int i =0; i<bankCards.size();i++){
            System.out.println(bankCards.get(i));
        }
        for (Object cards : bankCards){
            System.out.println(cards);
        }

}}