package sec2;
// 다른 함수를 정의 하여 그 함수에 예외를 떠넘기기
public class ThrowExam2 {
	public static void main(String[] args) {
	// main 메소드 throws로 예외를 떠넘기지 않는 경우
	String name = null;
	nullPassing(name);
	
	int[] arr = new int[3];
	
	String data = " kim1004 ";

	}	
	public static void nullPassing(String name) throws NullPointerException {
		System.out.println(name);
	}
	public static void arrayPassing(int[]arr) throws ArrayIndexOutOfBoundsException {
		int tot = 0;	
		for(int i=10; i<10; i++) {
				System.out.println(arr[i]);
				tot += arr[i];
			}
				System.out.println("합계 :" + tot);
	}
}
