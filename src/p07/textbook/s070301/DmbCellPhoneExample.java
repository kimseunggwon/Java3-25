package p07.textbook.s070301;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		
	
   //DmbCellPhone 객체 생성
	DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰","검정",10);
	
	//CellPhone으로부터 상속받은 필드
	System.out.println("모델:" + dmbCellPhone.model);
	System.out.println("색상:" + dmbCellPhone.color);
	
	//DmbCellPhone의 필드
	System.out.println("채널:" + dmbCellPhone.channel);
	}
}
