package sec1;
// ����(Failure) : �ý������� �̻����� ���������� �ϵ��� ����Ʈ��� �������� �� �ϴ� ����
// ���� (Error) : ���α׷� �۾��ÿ� �ڵ��� ������ ���� ����, �������� ���� ������ �Ǽ� ������ ���� ��������
// 		���� ����(Syntax Error), �� ����(Logical Error), ���� ����(Run time Error)
// ���� (Exception) : ���� �̳� ���� �� �ٸ��� �������� �߸��� �ڵ����� ���� ���������� 
// ����ġ (Mismatch) : �������� ����� �ٸ��� ����� ǥ��Ǵ� ������ ���α׷� �ڵ� �� �ش� ����̳� ������
// ����(Exception) ó��: ���α׷��� ������ ������ �߻��ϸ� , �� ������ ó�� ������ ó������ ���ϰ�, ������ �����Ǵµ�
// �̷��� ��츦 ���ܶ�� �ϸ�, ���� ������� ����� �� �ֵ��� 
// ���� ������ ��� ���� ���嵵 ó���� �� �ֵ��� �ϴ� ���� ���� ó����� �մϴ�.
// ������ ���� : IOException, RuntimeException, SQLException....

public class ExceptionExam1 {

	public static void main(String[] args) {
		String name = null;
		// ���� ó���� ����(try)�� ���ܰ� �߻��ϸ� ����ó�� ����(catch)�� �����Ѵ�.
		
		try {
			System.out.println(name.toString());
			// ���� ó�� ����
			System.out.println(" ����ó�� ���� �Ʒ� ");
		} catch(NullPointerException e) {
			// ���ܰ� �߻��� ��� ó���� ����.
			e.printStackTrace();
			name = "�����";
			System.out.println(name + "\n ����ó�� ���� �Ʒ�");
		} catch(Exception e ) {
			System.out.println("�� �� ���� ���ܰ� �߻��Ͽ����ϴ�.");
		}
	}
}
