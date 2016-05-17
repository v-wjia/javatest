/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest;
import javatest.bubblesort.*;
import javatest.selectsort.*;
import javatest.insertsort.*;
import quicksort.*;

/**
 *
 * @author v-wjia
 */
public class JavaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int SortList[] = {5, 2, -1, 9, 8, 0, 6};
        
        //Bubble Sort
        BubbleSort BubbleSort = new BubbleSort();
        BubbleSort.run(SortList);
        
        //Select Sort
        SelectSort SelectSort = new SelectSort();
        SelectSort.run(SortList);
        
        //Insert Sort
        InsertSort InsertSort = new InsertSort();
        InsertSort.run(SortList);
        
        //Quick Sort
        QuickSort QuickSort = new QuickSort();
        QuickSort.run(SortList, 0, SortList.length-1);
    }
    
}
