package Al.selection_Sort;

import Al.util.Tool;

public class Selection_Sort {
	public static void Selection_Sort(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			int minIndex = i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[minIndex]>arr[j]){
					minIndex = j;
				}	
			}
			
			Tool.swapByArr(arr,minIndex, i);
	
		}
		
	}
	
}
// https://github.com/liuyubobobo/Play-with-Algorithms