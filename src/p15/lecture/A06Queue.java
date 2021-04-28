package p15.lecture;

import java.util.LinkedList;
import java.util.Queue;

public class A06Queue {
  //선입선출 FIFO :First In First Out
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		
		queue.offer(9);
		queue.offer(6);
		queue.offer(3);
		
		int first =queue.poll();
		
		System.out.println(first); //9
		System.out.println(queue.poll());//6
		System.out.println(queue.poll());//3
		System.out.println(queue.poll());//null (없는값을 꺼내면 null 리턴됨)
		
		queue.offer(30);
		queue.offer(10);
		queue.offer(20);
		
		System.out.println(queue.peek()); //30 //가장먼저들어가있는 30이 먼저 출력
		System.out.println(queue.peek()); //30 //peek는 객체를 스택에서 제거하지 않는다.
	}
}
