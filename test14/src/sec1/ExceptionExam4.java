package sec1;
// NumberFormatException : ���� ���°� �ƴ� ��� �߻��ϴ� ����

public class ExceptionExam4 {
	public static void main(String[] args) {
		String data1 = "1004";
		String data2 = "kim1004";	
		int val1, val2;
		try {
			val1 = Integer.parseInt(data1);
			val2 = Integer.parseInt(data2); 
			// ���� ������ ��ȯ�� �� ���� ���ڿ�
			System.out.println(val1);
			System.out.println(val2);
			System.out.println(val1+20);
		} catch(NumberFormatException e) {
			System.out.println("���� �������� ó���� �� ���� ������");
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("��ü�� �� �� ���� ����");
			e.getMessage();
		} finally {
			System.out.println("����");
		}
	}
}
