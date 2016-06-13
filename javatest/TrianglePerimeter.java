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
public class TrianglePerimeter {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        
        double edge1 = input.nextDouble();
        double edge2 = input.nextDouble();
        double edge3 = input.nextDouble();
        
        boolean IsValid = (edge1+edge2>edge3) && (edge2+edge3>edge1) && (edge1+edge3>edge2);
        
        System.out.println("Perimeter is "+(edge1+edge2+edge3)+ " and is "+IsValid);
    }
}
