package Al.sort.selection_Sort;

import Al.sort.Sort;
import Al.util.Tool;

public class Selection_Sort implements Sort{

	@Override
	public void sort(int[] arr) {
		// TODO Auto-generated method stub
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