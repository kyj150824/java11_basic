package sec2;

import java.io.FileInputStream;
import java.io.IOException;

public class ThrowExam {
// ���ܶ��ѱ��
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		String absolutPath = "d:\\kyj\\java2\\test14\\bin\\sec2\\a.txt"; 
		// ������
		String relativePath = "./a.txt"; 
		// ��� ��� -> ���� ���丮
		String relativetPath2 = "../a.txt";
		// ��� ��� -> �������丮 
		String relativetPath3 = "../a.txt";
		// ��� ��� -> test14 ���丮 �ȿ�
		fis = new FileInputStream(absolutPath);
		if(fis != null) {
			fis.close();
		}

	}

}
