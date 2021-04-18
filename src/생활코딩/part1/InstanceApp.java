package 생활코딩.part1;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class InstanceApp {
  public static void main(String[] args) throws FileNotFoundException {
	
	  PrintWriter p1 = new PrintWriter("result1.txt");
	  p1.write("HelloWorld 1");
	  p1.close();
	  
	  PrintWriter p2 = new PrintWriter("result2.txt");
	  p1.write("HelloWorld 2");
	  p1.close();
	  
	  System.out.println(p1.toString());
	  p2.toString();
	  p2.write("Hello");
	  
  }
}
