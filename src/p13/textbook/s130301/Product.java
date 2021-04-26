package p13.textbook.s130301;

//2개 파라미터값 T, M 을가지고 있다
	public class Product<T, M> {
		private T kind;
		private M model;

		public T getKind() {
			return kind;    //get은 private 클래스가 빠져나가서 사용될수 있도록 정의
		}

		public void setKind(T kind) {
			this.kind = kind;  //set 지정 어떤메소드 인지 정의
		}
		

		public M getModel() {
			return model;
		}

		public void setModel(M model) {
			this.model = model;
		}

	}
