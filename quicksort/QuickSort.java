/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;
import java.util.Arrays;

/**
 *
 * @author v-wjia
 */
public class QuickSort {
    public static void main(String [] args) {
        System.out.println("This is Quick Sort.");
    }
    
    public void run(int[] SortList) {
        int[] Sortedlist = quicksort(SortList, 0, SortList.length-1);
        PrintList(Sortedlist);
    }
    
    public int[] quicksort(int[] SortList, int left, int right) {
//        int left = 0;
//        int right = SortList.length;
        if (left < right) {
            int i = left, j = right, x = SortList[left]; 
            while(i < j) {
                while(i<j && SortList[j] >= x) {
                    j--;
                }
                if (i < j) {
                    SortList[i++] = SortList[j];
                }
                
                while(i<j && SortList[i] < x) {
                    i++;
                }
                if (i < j) {
                    SortList[j--] = SortList[i];
                }
            }
            
            SortList[i] = x;
            quicksort(SortList, left, i-1);
            quicksort(SortList, i+1, right);
        }
        
        return SortList;
    }
    
    public static void PrintList(int[] SortList) {
        System.out.println("Sort by Quick Sort: "+ Arrays.toString(SortList));
    }
}

