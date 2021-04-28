package p15.lecture;

import java.util.Stack;

public class A05Stack {
    public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		stack.push(3);
		stack.push(5);
		stack.push(6);
		
		
		int last = stack.pop();
		System.out.println(last);  //6을 꺼냄
		
		last = stack.pop();
		System.out.println(last); //5을 꺼냄
		
		last =stack.pop();
		System.out.println(last); //3을 꺼냄
		
//		last =stack.pop();
//		System.out.println(last); //에러 (더이상 꺼낼게 없다)
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		last = stack.peek();     //30 //peek는 객체를 스택에서 제거하지 않는다
		System.out.println(last);
		
		last =stack.peek();      //30
		System.out.println(last);
		
	}
}
