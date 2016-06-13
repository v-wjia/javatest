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
public class E_4_19 {
//    public static void main(String[] args) {
//        final int NUMBER_OF_LINES = 10;
//        int count = 1;
//        for (int i = 0; i < NUMBER_OF_LINES; i++) {
//            // Pad leading blanks
//            for (int j = i; j < NUMBER_OF_LINES - 1; j++) {
//                System.out.print("    ");
//            }
//
//            for (int j = 0; j < 2 * i - 1; j++) {
//                System.out.printf("%4d", count++);
//            }
//
//            System.out.println();
//        }
//    }
    public static void main(String[] args) {
    int number = 0; // Number to print

    for (int row = 0; row <= 7; row++) {
      // Pad leading blanks
      for (int col = 1; col <= 7 - row; col++)
        System.out.print("     ");

      // Print left half of the row
      for (int col = 0; col <= row; col++) {
        number = (int)Math.pow(2, col);

        // You can write a method in Chapter 4 for this section
        if (number > 100) {
          System.out.print("  " + number);
        }
        else if (number > 10) {
          System.out.print("   " + number);
        }
        else {
          System.out.print("    " + number);
        }
      }

      // Print the right half of the row
      for (int col = row - 1; col >= 0; col--) {
        number = (int)Math.pow(2, col);

        // You can write a method in Chapter 4 for this section
        if (number > 100) {
          System.out.print("  " + number);
        }
        else if (number > 10) {
          System.out.print("   " + number);
        }
        else {
          System.out.print("    " + number);
        }
      }

      // Start a new line
      System.out.print('\n');
    }
  }
}
