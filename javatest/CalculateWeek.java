/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest;

import java.util.Scanner;

class CalculateWeek {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter year: (eg. 2008) ");
        int year = input.nextInt();

        System.out.println("Enter month: 1-12");
        int month = input.nextInt();
        
        if (month == 1) {
            month = 13;
            year--;
        } else if (month == 2) {
            month = 14;
            year--;
        }
        

        System.out.println("Enter the day of the month:");
        int day = input.nextInt();

        int j = year / 100;
        int k = year % 100;

        int h = (day + (26 * (int)(month + 1) / 10) + k + (int)(k / 4) + (int)(j / 4) + 5 * j) % 7;

        switch (h) {
            case 0:
                System.out.println("Today is Saturday.");
                break;
            case 1:
                System.out.println("Today is Sunday.");
                break;
            case 2:
                System.out.println("Today is Monday.");
                break;
            case 3:
                System.out.println("Today is Tuesday.");
                break;
            case 4:
                System.out.println("Today is Wednesday.");
                break;
            case 5:
                System.out.println("Today is Thursday.");
                break;
            case 6:
                System.out.println("Today is Friday.");
                break;
        }

    }
}
