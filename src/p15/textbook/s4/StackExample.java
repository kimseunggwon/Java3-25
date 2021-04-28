package p15.textbook.s4;

import java.util.Stack;

public class StackExample {
  public static void main(String[] args) {
	Stack<Coin> coinBox = new Stack<Coin>();
	//Last In First Out = LIFO
	//나중에 나온게 먼저 출력됨  10  / 500 / 50 / 100 
	
	coinBox.push(new Coin(100));
	coinBox.push(new Coin(50));
	coinBox.push(new Coin(500));
	coinBox.push(new Coin(10));
	
	while(!coinBox.isEmpty()) {
		Coin coin = coinBox.pop(); //팝으로 코인을 꺼낸다
		System.out.println("꺼내온 동전 :" + coin.getValue()+"원");
	}
}
}
