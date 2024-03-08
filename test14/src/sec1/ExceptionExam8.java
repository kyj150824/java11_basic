package sec1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

// ��ø ���� ó�� : try~catch ���� �ȿ� try~catch�� �������� ����Ǵ� ���
// ���ǻ��� : ���� ó�� ��ü(�ν��Ͻ�)���� �ܺ� try~catch�� ���� try~catch �� ���� �޶�� �Ѵ�.

public class ExceptionExam8 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream ois = null;
		try {
			fis = new FileInputStream("indata.txt");
			try {
				ois = new FileOutputStream("outdata.txt");
			} catch(FileNotFoundException e1) {
				System.out.println("ois�� �ش� ������ ã�� �� �����ϴ�.");
			}
		} catch(FileNotFoundException e) {
			System.out.println("fis�� �ش� ������ ã�� �� �����ϴ�.");
			try {
				ois = new FileOutputStream("outdata.txt");
			} catch(FileNotFoundException e1) {
				System.out.println("ois�� �ش� ������ ã�� �� �����ϴ�.");
			}
		} catch(Exception e) {
			System.out.println("���κҸ�");
			e.printStackTrace();
		} finally {
			System.out.println("���� ó�� ����");
		}

	}
}