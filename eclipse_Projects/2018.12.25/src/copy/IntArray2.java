package copy;

import java.util.Arrays;

/**
 * �����࣬�ڲ�����int����洢����
 * @author Administrator
 * @version 2.0;
 * 		�������ܣ�
 * 			1���Դ���ָ����������������
 * 			2�ṩ�鿴�û���ӵ�Ԫ�ظ����ķ���
 * 		
 */
public class IntArray2 {
	private int[] data;
	/**��ʾ�����������û���ӵ�Ԫ�ظ���*/
	private int size = 0;
	
	public IntArray2(int len){
		data = new int[len];
	}
	
	public IntArray2(){
		this(5);
	}
	
	public int getSize(){
		return this.size;
	}
	
	/**
	 * ��ӷ���
	 * 		�û�����һ�δ˷����Ϳ��Դ洢һ������
	 * 		�˷�����Ҫ��ɵĹ��ܾ��� ��ele ����data������
	 * @param ele  ��ʾ����ӵ�Ԫ��
	 */
	public void add(int ele){
		data[size] = ele;
		size++;
	}
	
	/**
	 * ��Ҫ�ѵ�ǰ���������е����� ����   ת��    ----�� [123,345,33,44]�ַ���������
	 * Ӧ��ֻȡ�����е� size��
	 */
	@Override
	public String toString() {
		
//		return Arrays.toString(data);
		/*
		 * ����һ�������飬����   size
		 * ��data��ǰsize��������������
		 * return Arrays.toString(������);
		 */
		int[] temp = new int[size];
		System.arraycopy(data, 0, temp, 0, size);
		return Arrays.toString(temp);
		
		
		// ����һ
	/*	String str = "[";
		for (int i = 0; i < size; i++) {
			if(i==size-1){
				str += data[i];
			}else{
				str += data[i]+",";
			}
		}
		str += "]";
		return str;*/
	}
}
