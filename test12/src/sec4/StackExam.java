package sec4;

import java.util.Stack;

// 스택(Stack) : 탑 같이 입력할때는 쌓아 올려지고, 출력할 때는 반대로 맨 위 마지막에 입력한 가장 위에 입력된 데이터부터 된다.
// LIFO(Last In First Out) - 후입선출
public class StackExam {

	public static void main(String[] args) {
		Stack<String> stack = new Stack();
		
		//요소추가
		stack.push("사과");
		stack.push("파인애플");
		stack.push("수박");
		stack.push("멜론");
		stack.push("체리");
		stack.push("암라");
		stack.push("불수감");
		
		System.out.println(stack);
		
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	}

}
