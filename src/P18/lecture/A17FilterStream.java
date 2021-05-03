package P18.lecture;
//한글 추가

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

//다른 스트링으로 부터 읽는 스트링을 필터해서 읽을 수 있다

public class A17FilterStream {
    public static void main(String[] args)throws Exception {
		//inputstream -> reader
    	String file = "src/p18/lecture/A17FilterStream.java";
    	InputStream is =getInputStream(file);
    	InputStreamReader isr = new InputStreamReader(is);
    	
    	int b =0;
    	
    	while((b = is.read()) != -1) {
    		System.out.println((char) b);
    	}
     	
    	isr.close();
    	is.close();
    	
	}
    
    public static InputStream getInputStream(String file) throws Exception{
    	return new FileInputStream(file);
    }
}
