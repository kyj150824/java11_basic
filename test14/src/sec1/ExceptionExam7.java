package sec1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// FileNotFoundException : �ش� ��ο� ������ �������� �ʴ� ��� �߻��ϴ� ���� 

public class ExceptionExam7 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream ois = null;
		try {
			fis = new FileInputStream("indata.txt");
			ois = new FileOutputStream("outdata.txt");
		} catch(FileNotFoundException e) {
			System.out.println("�ش� ������ ã�� �� �����ϴ�.");
		} catch(IOException e) {
			System.out.println("����� ���� ���� �߻�");
		} catch(Exception e) {
			System.out.println("���κҸ�");
			e.printStackTrace();
		} finally {
			System.out.println("���� ó�� ����");
		}
	}
}