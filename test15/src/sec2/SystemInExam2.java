package sec2;

import java.io.IOException;

public class SystemInExam2 {
// Ű���� ���� ���� �Է��Ͽ� ���δ��� �Է��Ͽ� ���
	public static void main(String[] args) throws IOException {
		System.out.println("���� �ܾ� �Ǵ� ������ �Է��ϰ�, [Enter]�� ��������.");
		int i;
		String data = "";
		try {
			while((i=System.in.read()) != '\n') {
			System.out.println("�Էµ� ���� : " + ((char) i));
				data += i;
				}
			} catch(IOException e) { 
				e.printStackTrace();
		}
				System.out.println("�Էµ� �ܾ� �Ǵ� ���� : " + data);
	}

}
