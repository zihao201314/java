package copy;

public class IntArray3Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 1 ����һ���Զ���������Ķ���
		IntArray3 ia1 = new IntArray3(2);
		// 2 ���������������
		ia1.add(123);
		ia1.add(33);
		ia1.add(33);
		ia1.add(33);
		ia1.add(33);
		ia1.add(12.0);
		ia1.add("adflkjasd");
		ia1.add(new Object());
		ia1.add(true);
		// 3 ��֤�Ƿ���ӳɹ�
		System.out.println(ia1);//cn.it.source.list.IntArray@5a2264c
		// ϣ���õ�  [123,345,33,44]  ---> ��дIntArray��toString����
		System.out.println(ia1.getSize());
		
	}
}
