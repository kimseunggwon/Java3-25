package p07.textbook.s070313;

public class AnimalExample {
      public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		
		System.out.println("ㅡㅡㅡ");
		
		//변수의 자동 타입 변환
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		
		animal = new Cat();
		animal.sound();
		System.out.println("ㅡㅡㅡ");
		
		//메소드의 다형성
		
		animalSound(new Dog());
		animalSound(new Cat());	
	}
      
      
      private static void animalSound(Animal animal) {
    	  animal.sound();
      }
 }
