package sec3;
// �ڵ� �ν���� => ���ɰ���, �ڵ� �ۼ� ��Ģ �ؼ�, ���� �߻� ���ɼ� �ּ�ȭ�ϱ� ���� �ҽ� �ڵ� ���� �۾�
// PMD : �ڵ� �ν���� ����  
// Code Inspection Level
// name Symbol Level Comment
// Blocker 
// Critical
// Urgent
// Important
// Warning


public class CodeInspectorExam {
	public static void main(String[] args) {
			Reader r1 = new Reader();
			Reader r2 = new Reader(2,"http://www.naver.com", "���̹� ����Ʈ", 1);
			r1.def= "���� ������"; 
		//	System.out.println(r2.toString());
		//	System.out.println(r2.def);
	}

}
