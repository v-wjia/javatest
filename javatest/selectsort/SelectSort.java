/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest.selectsort;

import java.util.Arrays;

/**
 *
 * @author v-wjia
 */
public class SelectSort {
    public static void main(String[] args) {
        System.out.println("This is my Select Sort.");
    }
    
    public static void run(int[] SortList) {
        int Min = 0;
        
        for(int i=0; i<SortList.length-1; i++) {
            Min = i;
            for(int j=i+1; j<SortList.length; j++) {
                
                if(SortList[Min]>SortList[j]) {
                    Min = j;
                }
                
            }
            
            if (Min != i) {
                swap(SortList, Min, i);
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
