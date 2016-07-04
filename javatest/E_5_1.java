/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest;
import java.util.Scanner;
import java.lang.Math.*;
/**
 * sum a number's int digits total
 * @author v-wjia
 */
public class E_5_1 {

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum1 = GetSum(num);
        System.out.println(sum1);
    }
    
    public static int GetSum(long num) {
        int total = 0;
        int temp = (int)Math.abs(num);
        while(temp != 0) {
            int mod = temp % 10;
            if (mod != 0) {
                total += mod;
            }
            temp = temp / 10;
        }
        return total;
    }
}
