package copy;

public class IntArray2Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 1 ����һ���Զ���������Ķ���
		IntArray2 ia1 = new IntArray2(100000);
		// 2 ���������������
		ia1.add(123);
		ia1.add(123);
		ia1.add(123);
		ia1.add(123);
		ia1.add(123);
		ia1.add(123);
		ia1.add(123);
		ia1.add(123);
		ia1.add(123);
		ia1.add(123);
		ia1.add(123);
		ia1.add(123);
		ia1.add(123);
		ia1.add(123);
		ia1.add(123);
	
		ia1.add(33);
		ia1.add(33);
		ia1.add(33);
		ia1.add(33);
		ia1.add(33);
		ia1.add(33);
		ia1.add(33);
		// 3 ��֤�Ƿ���ӳɹ�
		System.out.println(ia1);//cn.it.source.list.IntArray@5a2264c
		// ϣ���õ�  [123,345,33,44]  ---> ��дIntArray��toString����
		System.out.println(ia1.getSize());
		
	}
}
