package copy;

import java.util.Arrays;

/**
 * �����࣬�ڲ�����int����洢����
 * @author Administrator
 * @version 4.0;
 * 		���е�3.0���ܣ�
 * 			1 �Զ����ݣ�ԭ��
 * 				���ڲ��洢���ݵ�����data������ʱ�򣬴���һ���µĸ��������
 * 			2 ���Դ洢�������͵�����  ---����ʵ�ڲ�ʹ��Object[] 	
 * 
 * 		�������ܣ�
 * 			���ң�
 * 				1 ����ָ����������ֵ
 * 				2����ָ��Ԫ�ص�����λ�ã���һ�γ��ֵ�λ�ã�
 * 
 * 			ɾ��
 * 				1 ɾ��ָ����������Ԫ��
 * 				2 ɾ��ָ����Ԫ�أ���һ����
 * 			
 * 			�жϴ��������Ƿ����ָ����Ԫ��
 * 		
 */
public class IntArray4 {
	private Object[] data;
	/**��ʾ�����������û���ӵ�Ԫ�ظ���*/
	private int size = 0;
	
	public IntArray4(int len){
		data = new Object[len];
	}
	
	public IntArray4(){
		this(5);
	}
	
	public int getSize(){
		return this.size;
	}
	
	public boolean contains(Object ele){
		int index = this.getFirstIndex(ele);
		return (index<0) ? false : true;
	}
	
	public void deleteFirstElement(Object ele){
		//���ҵ����Ԫ�صĵ�һ������
		int index = this.getFirstIndex(ele);
		this.deleteElementByIndex(index);
	}
	
	/**
	 * ɾ����ԭ����ǰ�Ҫ��ɾ��������֮���ÿһ��Ԫ����ǰ�ƶ�һλ
	 * @param index
	 */
	public void deleteElementByIndex(int index){
		if(index>=size || index<0){
			throw new ArrayIndexOutOfBoundsException("�ף�����Խ���ˣ���Ч������Χ[0,"+size+")");
		}
//	��ʽ2  ֱ��ʹ�����鿽������  ԭ�����Ŀ�����鶼���Լ�
		System.arraycopy(data, index+1, data, index, size-index-1);
		
//	��ʽ1	
//		for (int i = 0; i < size-index-1; i++) {
//			data[index+i] = data[index+1+i];
//		}
		
		size--;
	}
	
	/**
	 * 2����ָ��Ԫ�ص�����λ�ã���һ�γ��ֵ�λ�ã�
	 * @param ele �����ҵ�Ԫ��
	 * @return eleԪ�ص�һ�γ��ֵ�����,���û����ôһ��Ԫ��  ����һ��-1��
	 * 		ԭ�� ����data������ҷ�ΧӦ����[0,size) 
	 */
	public int getFirstIndex(Object ele){
		for (int i = 0; i < size; i++) {
			if(data[i].equals(ele)){
				return i;
			}
		}
		return -1;
	}
	
	
	/**
	 *  ����ָ����������ֵ
	 * @param index ���뱻���ҵ�����
	 * @return index��������Ԫ��
	 */
	public Object getElementByIndex(int index){
		if(index>=size || index<0){
			throw new ArrayIndexOutOfBoundsException("�ף�����Խ���ˣ���Ч������Χ[0,"+size+")");
		}
		return data[index];
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
