package sec1;
// ����/Ű����/������ �Է� : FileInputStream, BufferedInputStream, FileReader, BufferedReader
// ����/�����/������ ��� : FileOutputStream, BufferedOutputStream, FileWriter, BufferedWriter
// Stream���� ������ Ŭ������ ������ ������� ����Ʈ ������ : FileInputStream, BufferedInputStream, FileOutputStream, BufferedOutputStream
// Stream���� ������ �ʴ� Ŭ������ ������ ������� ���� ������ : FileReader, BufferedReader, FileWriter, BufferedWriter

public class StreamExam {
	public static void main(String[] args) {
		String fileInputStream = "FileInputStream�� ����Ʈ ������ �Է��ϱ� ���� ��Ʈ��";
		String buffredInputStream = "BufferedInputStream�� ����Ʈ ������ �Է��ϱ� ���� ��Ʈ�� : �޸� ���۷� �ε� ��";
		String fileReader = "FileReader�� ���� ������ �Է��ϱ� ���� ��Ʈ��";
		String bufferedReader = "BufferedReader�� ���� ������ �Է��ϱ� ���� ��Ʈ�� : �޸� ���۷� �ε� ��";
		String fileOutputStream = "FileOutputStream�� ����Ʈ ������ ����ϱ� ���� ��Ʈ��";
		String buffredOutputStream = "BufferedOutputStream�� ����Ʈ ������ ����ϱ� ���� ��Ʈ�� : �޸� ���۷� �ε� ��";
		String fileWriter = "FileWriter�� ���� ������ ����ϱ� ���� ��Ʈ��";
		String bufferedWriter = "BufferedWriter�� ���� ������ ����ϱ� ���� ��Ʈ�� : �޸� ���۷� �ε� ��";		
		
		System.out.println(fileInputStream);
		System.out.println(buffredInputStream);
		System.out.println(fileReader);
		System.out.println(bufferedReader);
		System.out.println(fileOutputStream);
		System.out.println(buffredOutputStream);
		System.out.println(fileWriter);
		System.out.println(bufferedWriter);
	}
}