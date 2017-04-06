package Al.util;

final public class Tool {
	
	/**
	 * 交换数组中的两个元素
	 */
	public static void swapByArr(int[] arr,int a,int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	/**
	 * 生成随机数组
	 */
	public static int[] radomArr(int lenght,int start,int end){
		
		int[] arr = new int[lenght];
		int A = end -start;
		for (int i = 0; i < arr.length; i++) {
			double temp = Math.random()*A;
			
			arr[i] = (int)temp +start;
			
		}
		
		return arr;
	}
}
