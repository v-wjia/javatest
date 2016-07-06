/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest;

/**
 *
 * @author v-wjia
 */
public class E_5_13 {
    public static void main(String [] args) {
        System.out.println("i\t\tm(i)");
        double total =0;
        for(int i=1; i<=20; i++) {
            total += (double)i/(i+1);
            System.out.println(i+ "\t\t" + total);
        }
        
    }
}
