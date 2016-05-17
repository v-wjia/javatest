/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest.insertsort;
import java.util.Arrays;

/**
 *
 * @author v-wjia
 */
public class InsertSort {
    public static void main(String [] args) {
        System.out.println("This is Insert Sort");
    }
    
    public static void run(int[] SortList) {
        for(int i=1; i<SortList.length; i++) {
            int j = i-1;
            int key = SortList[i];
            while(j>0 && SortList[j]>key) {
                SortList[j+1] = SortList[j];
                j--;
            }
//            SortList[j+1] = key;            
        }
        PrintList(SortList);
    }
    
    public static void PrintList(int[] SortList) {
        System.out.println("Sort by Insert Sort:" + Arrays.toString(SortList));
    }
}
