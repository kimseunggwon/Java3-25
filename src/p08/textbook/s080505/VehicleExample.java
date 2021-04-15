package p08.textbook.s080505;

public class VehicleExample {
  public static void main(String[] args) {
	Vehicle vehicle = new Bus();
	
	vehicle.run();
	//Vehicle.checkFare();     //x
	
	}
    Bus bus = (Bus) vehicle;    //강제 타입 변환
    
    bus.run();
    bus.checkFare();
   }
 }
