package day1;
/**
 * �������+����+���ַ�������+��ǿfor
 */


import java.util.Arrays;
import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������5������Ԫ��");
	
		int[] a = new int[5];
	     for(int i=0;i<a.length;i++) {
	    	 a[i] = sc.nextInt();
	     }
		Arrays.sort(a);
		System.out.println("������Ҫ��ѯ����");
		System.out.println("���ڵ�"+Arrays.binarySearch(a,sc.nextInt())+"��");
		
		
		System.out.println("----------");
		System.out.println("�������������");
		for(int e : a){
			System.out.println(e);		
		}
	
	}	
}