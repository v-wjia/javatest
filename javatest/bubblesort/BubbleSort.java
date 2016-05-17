/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest.bubblesort;
import java.util.Arrays;
/**
 *
 * @author v-wjia
 */
public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("This is my Bubble Sort.");
    }
    
    public static void run(int[] SortList) {
        for(int i=0; i<SortList.length-1; i++) {
            for(int j=SortList.length-1; j>i; j--) {
                if(SortList[j]<SortList[j-1]) {
                    swap(SortList, j-1, j);
                }
            }
        }
        PrintList(SortList);
    }
    
    public static void swap(int[] SortList, int i, int j){
        int temp = 0;
        temp = SortList[i];      
        SortList[i] = SortList[j]; 
        SortList[j] = temp;
    }
    
    public static void PrintList(int[] SortList) {
        System.out.println("Sort by Bubble:" + Arrays.toString(SortList));
    }
}
