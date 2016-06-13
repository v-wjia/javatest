/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author v-wjia
 */
public class IfinCircle {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a point with two cordinates:");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double CircleRadius = 10.0;
        double distance = Math.sqrt(Math.pow(x, 2)+ Math.pow(y, 2));
        if (distance >= CircleRadius) {
            System.out.println("Points are outside the circle." + distance);
        } else {
            System.out.println("Points are inside the circle." + distance);
        }
    }
}
