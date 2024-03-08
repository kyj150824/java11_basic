package sec2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExam2 {

	public static void main(String[] args) {
		String[] email = { "kkt09072", "kbs@naver.com", "naver@naver.com", "kyj150824com"};
		Pattern p1 = Pattern.compile("[a-zA=Z0-9]+@[a-zA-z0-9]+\\.[a-z]+$");
		// �̸��� ����
		for(int i =0; i<email.length; i++) {
			Matcher m = p1.matcher(email[i]);
		if(m.matches()) {
			System.out.println("�̸��� ������ �½��ϴ�.");
			System.out.println(email[i]);
			}else {
				System.out.println("�̸��� ������ �ƴմϴ�.");
			}
		}
		
		String[] phone = {"010-9148-7549", "010-1234-5697", "010-123-4558", "010-1234-56758"};
		Pattern p2 = Pattern.compile("010-\\d{3,4}-\\d{4}");
		// �޴��� ���� ��� �ڸ� ���� 3�� ��쵵 �޴���ȭ ���Ŀ� ���� ��츦 ���� ��Ŵ.
		//Pattern p2 = Pattern.compile ("01(?:0|1|[6-9])-(?:\\d{3}|\\d{4})-\\d{4}$"); - Ʋ���� �ƴ����� ���� ���� �� ����.
		for(int i =0; i<phone.length; i++) {
			Matcher m = p2.matcher(phone[i]);
		if(m.matches()) {
			System.out.println("�޴���ȭ ������ �½��ϴ�.");
			System.out.println(phone[i]);
			} else {
				System.out.println("��ȭ ������ �ƴմϴ�");
			}
		}
		
		String[] jm = {"123456-1234567", "123456-1234567", "123456-1234567", "123456-1234567"};
		Pattern p3 = Pattern.compile("\\d{6}\\-[1-4]\\d{6}");
		for(int i =0; i<jm.length; i++) {
			Matcher m = p3.matcher(jm[i]);
		if(m.matches()) {
			System.out.println("�ֹι�ȣ ������ �½��ϴ�.");
			System.out.println(jm[i]);
			} else {
				System.out.println("�ֹι�ȣ ������ �ƴմϴ�");
			}
		}
		
		String[] post = {"123-123", "123-12", "1523-123", "123-12" };
		// �����ȣ ���� : 100���� (1xx-yy) - 700����(7xx-yy)
		Pattern p4 = Pattern.compile("\\d[3,4]-\\d[2,3]");
		for(int i =0; i<post.length; i++) {
			Matcher m = p4.matcher(jm[i]);
		if(m.matches()) {
			System.out.println("���� ������ �½��ϴ�.");
			System.out.println(post[i]);
			} else {
			System.out.println("���� ������ �ƴմϴ�");
			}
		}
		
		// ��й�ȣ ����: 4~10 ���ڷ� ���� ��/�ҹ��ڿ� Ư������(!@#$%^&*?_) �׸��� ���ڸ� ��� �ּ� 1���ڸ� ����
		// () �ݵ�� ����
		// ? �ѹ���
		// =. �̻�
		// * �ڿ������� ����
		// (?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.[!@##$%^&*?_]).{4,10}$
		String[] pw = {"abcd1234", "A123a", "1234","ABCD!1234","ADFE!1004"};
		
		Pattern p5 = Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*?_]).{4,10}$");	//��й�ȣ ����
		for(int i =0; i<pw.length; i++) {
			Matcher m = p5.matcher(pw[i]);
		if(m.matches()) {
			System.out.println("��й�ȣ ������ �½��ϴ�.");
			System.out.println(pw[i]);
			} else {
			System.out.println("��й�ȣ ������ �ƴմϴ�");
			}
		}
	
	}
	}

	


