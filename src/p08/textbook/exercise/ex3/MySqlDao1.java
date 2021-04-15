package p08.textbook.exercise.ex3;

public class MySqlDao1 implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("MySql DB에서 선택");

	}

	@Override
	public void insert() {
		System.out.println("MySql DB에 삽입");

	}

	@Override
	public void update() {
		System.out.println("MySql DB에 업데이트");

	}

	@Override
	public void delete() {
		System.out.println("MySql DB에 삭제");

	}

}
