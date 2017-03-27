package Al.test;

import Al.selection_Sort.Selection_Sort;

public class test {
	public static void main(String[] args) {
		int arr[] = {10,9,8,7,6,5,4,3,2,1};
		System.out.println(arr);
		Selection_Sort.Selection_Sort(arr);
		System.out.println("----------");
		System.out.println(arr);
	}
}
