package sec1;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

// BufferedInputStream : ����Ʈ ����
// ����ȭ : Serialization(Serialize) => Externailization
public class BufferedInputStreamExam {
	public static void main(String[] args) throws IOException {
		BufferedInputStream input = null;
		try {
			input = new BufferedInputStream(new FileInputStream("a.txt"));
			while(input.available() > 0) {
				System.out.println((char) input.read());
			}
		} catch(Exception e) {
			System.out.println("���� �б� ����");
		} finally {
			if(input != null) {
				try {
					input.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}