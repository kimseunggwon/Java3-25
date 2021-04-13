package p07.textbook.s070310;

public class DriverExample {
public static void main(String[] args) {
	 Driver driver = new Driver();
	 
	 
	 Bus bus = new Bus();
	 Taxi taxi = new Taxi();
	 
	 driver.drive(bus);   //자동 타입 변환 =bus;
	 driver.drive(taxi);  //자동 타입 변환 =taxi;
}

}
