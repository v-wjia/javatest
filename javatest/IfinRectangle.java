/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest;
import java.util.Scanner;
/**
 *
 * @author v-wjia
 */
public class IfinRectangle {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 2 cordinates.");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double width = 10.0;
        double height = 5.0;
        if (x <= width/2 && y <= height/2) {
            System.out.println("They are inside of the rectangle.");
        } else {
            System.out.println("They are outside of the rectangle.");
        }
    }
}
