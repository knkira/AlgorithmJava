package Al.util;

final public class Tool {
	public static void swapByArr(int[] arr,int a,int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	public static void swap(int a,int b){
		int temp = a;
		a = b;
		b = temp;
	}
}
