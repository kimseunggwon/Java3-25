package 생활코딩.part1;

public class OkJavaGoInHome {
	public static void main(String[] args) {

		// Elevator call
		public class Elevator {
			String _id;
			public Elevator(String id) {
				this._id = id;
			}

			public Boolean callForUp(int stopFloor) {
				System.out.println(this._id+" -> Elevator callForUp stopFloor : "+stopFloor);
				return true;
			}
			
			public Boolean callForDown(int stopFloor) {
				System.out.println(this._id+" -> Elevator callForDown : "+stopFloor);
				return true;
			}
		}

		
		// Security off 

		// Light on

	}
}
