package javatest.bubblesort;
import java.util.Arrays;

public class BubbleSort2 {
	public static void main(String[] args) {
		BubbleSort2 bs2 = new BubbleSort2();
		int[] list = {9,5,4,7,8,1,2};
		bs2.bs(list);
	}
	
	public void bs(int[] list) {
		boolean loopPass = true;
		for(int k=1; k<list.length && loopPass; k++) {
			loopPass = false;
			for(int i=0; i<list.length-k; i++) {
				if (list[i] > list[i+1]) {
					swap(list, i);
					loopPass = true;
				}
			}
		}
		
		System.out.println(Arrays.toString(list));
	}
	
	public void swap(int[] list, int i) {
		int temp = list[i];
		list[i] = list[i+1];
		list[i+1] = temp;
	}
}
