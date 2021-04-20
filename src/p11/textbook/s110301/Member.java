package p11.textbook.s110301;

public class Member {
	public String id;  //id 라는필드를 가지고있다
	
	public Member(String id) {
		this.id = id;
	}
	@Override
	public int hashCode() {
		return 
				
				id.hashCode();
	}
	
	
	@Override //이퀄스라는 메소드로 재정의했다
	
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member =(Member) obj;	
			if(id.equals(member.id)) {
				return true;
			}
		}
		
		return false;
	}

}
