package sec2;

import java.io.IOException;
// Ű���� �ѱ��� �Է¹޾� ���
public class SystemInExam {

	public static void main(String[] args) throws IOException {
		System.out.println("�����͸� �Է��ϰ�, [Enter]�� ��������.");
		int i;
		try {
			i = System.in.read();
			// �ƽ�Ű�ڵ� �� ���� �Է� => ����Ʈ ���� �Է�
			System.out.println();
			System.out.println("�Էµ� ���� : " + ((char) i));
		} catch(IOException e) { 
			e.printStackTrace();
		}

	}

}
