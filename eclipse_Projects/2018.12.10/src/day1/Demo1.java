package day1;
/**
 * 输入语句+排序+二分法查数据+增强for
 */


import java.util.Arrays;
import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入5个数组元素");
	
		int[] a = new int[5];
	     for(int i=0;i<a.length;i++) {
	    	 a[i] = sc.nextInt();
	     }
		Arrays.sort(a);
		System.out.println("请输入要查询的数");
		System.out.println("它在第"+Arrays.binarySearch(a,sc.nextInt())+"个");
		
		
		System.out.println("----------");
		System.out.println("您输入的数组是");
		for(int e : a){
			System.out.println(e);		
		}
	
	}	
}