package p13.textbook.s130403;

import java.util.Arrays;

public class WildCardExample {
	 public static void registerCourse(Course<?> course) {
		 System.out.println(course.getName()+ "수강생:"+
	        Arrays.toString(course.getStudents()));
	 }
	 
	 public static void registerCourse(Course<? extends Student> course) {
		 System.out.println(course.getName()+ "수강생:"+
	        Arrays.toString(course.getStudents()));
	 
	} 
	 
	 public static void registerCourse(Course<? super Worker>course) {
		 System.out.println(course.getName()+ "수강생:"+
	        Arrays.toString(course.getStudents()));
	 
	} 
	 public static void main(String[]args) {
		 Course<Person> personCourse=new Course<Person>("일반인과정",5);
		 personCourse.add(new Person("일반인"));
		 personCourse.add(new Worker("직장인"));
		 personCourse.add(new Student("학생"));
		 personCourse.add(new HighStudent("고등학생"));
		 
		 Couser<Worker>workerCourse = new Course<Worker>("직장인과정",5);
		 workerCouser.add(new Worker("직장인"));
		 
		 Couser<Worker>workerCourse = new Course<Student>("학생과정",5);
		 StudentCouser.add(new Student("학생"));
		 StudentCouser.add(new HightStudent("고등학생"));
		 
		 Couse<HigthStudent> hightStudentCourse = 
				 new Course<HightStudent>("고등학생과정",5);
		   hihgtStudentCourse.add(new HighStudent("고등학생"));
		   
		   
		   
		 
		 
		 
	 }
}
