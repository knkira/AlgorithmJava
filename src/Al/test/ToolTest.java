package Al.test;

import Al.util.Tool;

public class ToolTest {
	public static void main(String[] args) {
		int[] a = Tool.radomArr(10000,10,10000);
		
		for (int i : a) {
			System.out.print(i+",");
		}	
	}
}	
