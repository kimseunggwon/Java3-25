package p09.lecture;

public class A04LocalClassAccess {
    void method( int param) {
    	// param과 localVar는 묵시적 final(effectivley fianl)
    	int localVar = 3;	
//    	localVar = 4;     //로컬값이 변하면 안된다
//    	param = 1;
    	
    	class LocalClass {
    		void method1() {
    			System.out.println(localVar);
    			System.out.println(param);
    		}
    	}
    }
}
