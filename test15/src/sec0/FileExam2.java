package sec0;

import java.io.File;
import java.io.IOException;

public class FileExam2 {
	public static void main(String[] args) throws IOException {
		// ������ ��� ��� ����
		File f1 = new File("a.txt");	
		// ���� ���丮�� ������ �ֵ� ���� ���� ��ü ����
		File f2 = new File("../sec1/a.txt");	
		// ���� ���丮 sec0���� ���� ���丮�� �̵��� �� sec1 ���丮�� a.txt �� ���� ��ü�� ����
		
		// ������ ���� ��� ����
		// d:\\kyj\\java\\a.txt
		File f3 = new File("d:"+File.separator+"kim"+File.separator+"java2"+File.separator+"a.txt");
		String path = "d:\\kyj\\java\\";
		File f4 = new File(path, "a.txt");
		File f5 = new File("d:\\kyj\\java\\", "a.txt");
		
	}
}
