package sec2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Pattern : Ư�� �����Ͱ� ������ �´��� ���Ϸ��� �� ��� ������ ������ �����ϴ� Ŭ����
// Matcher : Ư�� ������ ���°� �´��� ���ϴ� Ŭ����
// ���Խ�(Reg Expression) => RegEx
public class PatternExam1 {
	public static void main(String[] args) {
		String[] dt = {"bag", "kim1004", "9 to 6", "8 to 5", "single", "Mom", "ABC", "�����"};
		// Pattern p = Pattern.compile("[a-z]*"); 
		// ���� �ҹ��ڷθ� ������ ������
		// Pattern p = pattern.compile("{0-9a-z]*"); 
		// ���ڿ� ���� �ҹ��ڷθ� ������ ������
		// Pattern p = pattern.compile("[A-Za-z]*"); 
		// ���� �빮�� �Ǵ� �ҹ��ڷθ� ������ ������
		// Pattern p = Pattern.compile("s[A-Za-z]"); 
		// s�� �����ϸ鼭 ���� �빮�� �Ǵ� �ҹ��ڷθ� ������ ������.
		// Pattern p = Pattern.compile("[��-�R]"); 
		// �ѱ۷θ� ������ ������
		// Pattern p = Pattern.compile("e$");
		// Ư�� ���ڷ� ������ ��� ���� �ڿ� $
		// Pattern p = Pattern.compile("^b");
		// Ư�� ���ڷ� �����ϴ� ��� ���� �տ� ^
		// Pattern p = Pattern.compile("[0-9]*"); �Ǵ� Pattern p = Pattern.compile("^[0-9]"); 
		// ��� ���� ������ ������
		
		Pattern p = Pattern.compile("[0-9]*");
		for(int i = 0; i <dt.length;i++) {
			Matcher m = p.matcher(dt[i]);
			if(m.matches()) {
				System.out.println("���� ��ġ : " + dt[i]);
			}
		}
	}

}
