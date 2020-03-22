package copy;

import java.util.Arrays;

/**
 * �����࣬�ڲ�����int����洢����
 * @author Administrator
 * @version 3.0;
 * 		�������ܣ�
 * 			1 �Զ����ݣ�ԭ��
 * 				���ڲ��洢���ݵ�����data������ʱ�򣬴���һ���µĸ��������
 * 			2 ���Դ洢�������͵�����  ---����ʵ�ڲ�ʹ��Object[] 	
 * 		
 */
public class IntArray3 {
	private Object[] data;
	/**��ʾ�����������û���ӵ�Ԫ�ظ���*/
	private int size = 0;
	
	public IntArray3(int len){
		data = new Object[len];
	}
	
	public IntArray3(){
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
	public void add(Object ele){
		/**
		 * �����֮ǰӦ�����ж��Ƿ��пռ䣬���û�У����ݣ�������дһ�����ݵķ�����
		 */
		if(size>=data.length){
			ensureCapacity();
		}
		
		data[size] = ele;
		size++;
	}
	
	/**
	 * ���ݵķ�����
	 * 		�� ����һ�������飬����ǰ�ĸ��󣨲��� data.length * 2��
	 * 		�� ��ԭ�����е����ݿ�����������
	 * 		�� ���ڲ���data����ָ��������
	 */
	private void ensureCapacity() {
		Object[] temp = new Object[data.length*2];
		System.arraycopy(data, 0, temp, 0, size);
		data = temp;
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
		Object[] temp = new Object[size];
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
