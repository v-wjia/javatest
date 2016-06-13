/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest;
import java.lang.Math;

/**
 *
 * @author v-wjia
 */
public class PickPokerCard {
    public static void main(String [] args) {
        int TotalCards = 52;
        int CardNumber = (int)(Math.random()*TotalCards);
        System.out.println(CardNumber);
        
        if (CardNumber % 13 == 0) {
            System.out.println("This is Ace");
        } else if(CardNumber % 13 == 10) {
            System.out.println("This is Jack");
        } else if(CardNumber % 13 == 11) {
            System.out.println("This is Queen");
        } else if(CardNumber % 13 == 12) {
            System.out.println("This is King");
        } else {
            System.out.println("This is number "+ (CardNumber%13));
        }
        
        if (CardNumber / 13 == 0) {
            System.out.println("of clubs");
        } else if (CardNumber / 13 == 1) {
            System.out.println("of diamond");
        } else if (CardNumber / 13 == 2) {
            System.out.println("of heart");
        } else if (CardNumber / 13 == 3) {
            System.out.println("of spades");
        } 
    }
}
