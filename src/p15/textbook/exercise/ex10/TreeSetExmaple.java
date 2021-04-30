package p15.textbook.exercise.ex10;

import java.util.TreeSet;

import p07.textbook.s070301.Student;

public class TreeSetExmaple {
   public static void main(String[] args) {
	TreeSet<Student> treeSet = new TreeSet<Student>();
	treeSet.add(new Student("blue",96));
	treeSet.add(new Student("hong",86));
	treeSet.add(new Student("white",92));
	
	Student student = treeSet.last();
	System.out.println("최고점수:"+sudent.score);
	System.out.println("최고점수를 받은 아이디:"+student.id);
 }
}
