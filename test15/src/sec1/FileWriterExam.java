package sec1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExam {
	public static void main(String[] args) throws IOException {
		File file = new File("e.txt");
		if(!file.exists()){
			file.createNewFile();
		}
		BufferedWriter fw =  new BufferedWriter(new FileWriter(file, true));
		fw.write("��XX �� �ֹ��̳���?");
		fw.newLine();
		fw.write("���� �ϼž���? ����");
		fw.newLine();
		fw.write("�����ϰ� �� ����������, �� �� ���� �㹰��~!");
		fw.flush();
		fw.close();
	}
}