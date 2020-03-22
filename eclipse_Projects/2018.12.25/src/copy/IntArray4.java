package copy;

import java.util.Arrays;

/**
 * 容器类，内部基于int数组存储数据
 * @author Administrator
 * @version 4.0;
 * 		已有的3.0功能：
 * 			1 自动扩容（原理）
 * 				当内部存储数据的数组data存满的时候，创建一个新的更大的数组
 * 			2 可以存储任意类型的数据  ---》其实内部使用Object[] 	
 * 
 * 		新增功能：
 * 			查找：
 * 				1 返回指定索引处的值
 * 				2返回指定元素的索引位置（第一次出现的位置）
 * 
 * 			删除
 * 				1 删除指定索引处的元素
 * 				2 删除指定的元素（第一个）
 * 			
 * 			判断此容器中是否包含指定的元素
 * 		
 */
public class IntArray4 {
	private Object[] data;
	/**表示的是容器中用户添加的元素个数*/
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
		//先找到这个元素的第一个索引
		int index = this.getFirstIndex(ele);
		this.deleteElementByIndex(index);
	}
	
	/**
	 * 删除的原理就是把要求删除的索引之后的每一个元素向前移动一位
	 * @param index
	 */
	public void deleteElementByIndex(int index){
		if(index>=size || index<0){
			throw new ArrayIndexOutOfBoundsException("亲，索引越界了，有效索引范围[0,"+size+")");
		}
//	方式2  直接使用数组拷贝方法  原数组和目标数组都是自己
		System.arraycopy(data, index+1, data, index, size-index-1);
		
//	方式1	
//		for (int i = 0; i < size-index-1; i++) {
//			data[index+i] = data[index+1+i];
//		}
		
		size--;
	}
	
	/**
	 * 2返回指定元素的索引位置（第一次出现的位置）
	 * @param ele 被查找的元素
	 * @return ele元素第一次出现的索引,如果没有这么一个元素  返回一个-1；
	 * 		原理： 遍历data数组查找范围应该是[0,size) 
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
	 *  返回指定索引处的值
	 * @param index 传入被查找的索引
	 * @return index索引处的元素
	 */
	public Object getElementByIndex(int index){
		if(index>=size || index<0){
			throw new ArrayIndexOutOfBoundsException("亲，索引越界了，有效索引范围[0,"+size+")");
		}
		return data[index];
	}
	
	/**
	 * 添加方法
	 * 		用户调用一次此方法就可以存储一个数据
	 * 		此方法需要完成的功能就是 把ele 放在data数组中
	 * @param ele  表示被添加的元素
	 */
	public void add(Object ele){
		/**
		 * 在添加之前应该先判断是否还有空间，如果没有，扩容（单独的写一个扩容的方法）
		 */
		if(size>=data.length){
			ensureCapacity();
		}
		
		data[size] = ele;
		size++;
	}
	
	/**
	 * 扩容的方法：
	 * 		① 创建一个新数组，比以前的更大（策略 data.length * 2）
	 * 		② 把原数组中的数据拷贝到新数组
	 * 		③ 让内部的data变量指向新数组
	 */
	private void ensureCapacity() {
		Object[] temp = new Object[data.length*2];
		System.arraycopy(data, 0, temp, 0, size);
		data = temp;
	}

	/**
	 * 需要把当前容器对象中的数据 数组   转成    ----》 [123,345,33,44]字符串并返回
	 * 应该只取出其中的 size个
	 */
	@Override
	public String toString() {
		
//		return Arrays.toString(data);
		/*
		 * 定义一个新数组，长度   size
		 * 把data中前size个拷贝到新数组
		 * return Arrays.toString(新数组);
		 */
		Object[] temp = new Object[size];
		System.arraycopy(data, 0, temp, 0, size);
		return Arrays.toString(temp);
		
		
		// 方法一
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
