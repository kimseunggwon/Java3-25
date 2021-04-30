package p15.textbook.sa10;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExample {
    public static void main(String[] args) throws Exception{
		Properties properties = new Properties();
		
		//경로 얻을려고 쓴 코드 해석x
		String path =PropertiesExample.class.getResource("database.properties").getPath();
		path = URLDecoder.decode(path,"utf-8");
		properties.load(new FileReader(path));
		
		String driver = properties.getProperty("diver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		
		System.out.println("driver :" + driver);
		System.out.println("url :" + url);
		System.out.println("username :" + username);
		System.out.println("password :" + password);
	}
}
