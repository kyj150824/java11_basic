package sec2;
// �ٸ� �Լ��� ���� �Ͽ� �� �Լ��� ���ܸ� ���ѱ��
public class ThrowExam2 {
	public static void main(String[] args) {
	// main �޼ҵ� throws�� ���ܸ� ���ѱ��� �ʴ� ���
	String name = null;
	nullPassing(name);
	
	int[] arr = new int[3];
	
	String data = " kim1004 ";

	}	
	public static void nullPassing(String name) throws NullPointerException {
		System.out.println(name);
	}
	public static void arrayPassing(int[]arr) throws ArrayIndexOutOfBoundsException {
		int tot = 0;	
		for(int i=10; i<10; i++) {
				System.out.println(arr[i]);
				tot += arr[i];
			}
				System.out.println("�հ� :" + tot);
	}
}
