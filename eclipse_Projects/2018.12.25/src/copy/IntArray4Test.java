package copy;

public class IntArray4Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 1 ����һ���Զ���������Ķ���
		IntArray4 ia1 = new IntArray4(10);
		// 2 ���������������
		ia1.add(123);
		ia1.add(33);
		ia1.add(12.0);
		ia1.add("adflkjasd");
		ia1.add(new Object());
		ia1.add(true);
		System.out.println(ia1);
		System.out.println(ia1.getSize());
//		System.out.println(ia1.getElementByIndex(8));
//		System.out.println(ia1.getFirstIndex(true));
		ia1.deleteElementByIndex(2);
		System.out.println(ia1);
		System.out.println(ia1.getSize());
		
	}
}
