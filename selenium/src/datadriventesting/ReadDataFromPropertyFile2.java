package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertyFile2 {

			public static void main(String[] args) throws IOException    {
				//step1:create FileInputStream Object
				FileInputStream fis=new FileInputStream("./TestData/filename.properties");
				
				//step2:create respective file type object
				Properties prop = new Properties();
				
				//step3:call read methods
				prop.load(fis);
				String URL = prop.getProperty("url");
				String EMAIL = prop.getProperty("email");
				
				System.out.println(URL);
				System.out.println(EMAIL);
				
		  
			}
	}


