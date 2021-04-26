package p13.lecture;

public class A01Generic {
  //제네릭은 아직 타입이 완벽하게 결정되지 않은 타입
  //제네릭은 타입은 타입파라미터를 가진 타입
  //타입파라미터명 작성 규칙(관습) : 대문자 1개
  public static void main(String[] args) {
     GenericType1<Object> g1 = new GenericType1<Object>();
     GenericType1<String> g2 = new GenericType1<String>();
     GenericType1<Number> g3 = new GenericType1<> (); //앞에 타입겹치면 생략가능 
     }
	
}

class GenericType1<T> {
	//제네릭타입 클래스
	
}

interface GenericTypeInterface2<T,S,U> {
	//제네릭타입 인터페이스
}