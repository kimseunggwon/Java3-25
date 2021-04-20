package p11.lecture.object;

public class A03Equals {
    public static void main(String[] args) {
		Book b1 = new Book("java","trump");
		Book b2 = new Book("c++","donald");
		
		System.out.println(b1 == b2);
		System.out.println(b1.equals(b2)); //false 나온다 서로 다름
		
		Book b3 = new Book("spring","summer");
		Book b4 = new Book("spring","summer");
		
		System.out.println(b3==b4);
		System.out.println(b3.equals(b4)); //밑에 override 작성을 통해 같다고 했으므로 true
		
	}
}

class Book{
	private String title;
	private String writer;
	
	public Book(String title, String writer) {
		super();
		this.title = title;
		this.writer = writer;
	}
	
	@Override // 클래스 title 이랑 writer 같다는거를 작성
	public boolean equals(Object obj) {
		if(obj instanceof Book) {
			Book o =(Book) obj;
			
			return this.title.equals(o.title)  //제목과 타이틀이 같다는 작성  
			        && this.writer.equals(o.writer);
		}
		
		return false;
			
		}
}
