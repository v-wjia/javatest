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
 * @author jack
 */
public class E_5_3 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);        
        System.out.println("Please input an integer.");
        int num = input.nextInt();
        System.out.println("This number is Palindrome "+ isPalindrome(num));
    }
    
    public static int reverse(int number) {
        int temp = Math.abs(number);
        int res = 0;
        int n = 0;
        
        while(temp != 0) {
            int mod = temp % 10;
            res = res+mod*(int)Math.pow(10,n);
            temp = temp /10;
            n++;
        }
        return res;
    }
    
    public static boolean isPalindrome(int number) {
        System.out.println(reverse(number));
        if (reverse(number) == number) {
            return true;
        } else {
            return false;
        }
    }    
}
