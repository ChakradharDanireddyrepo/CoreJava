package collections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("src/collections/Properties.prop");
		Properties p=new Properties();
		p.load(fis);
		System.out.println("Name"+p.getProperty("Name"));
		System.out.println(fis);
		fis.close();
		System.out.println(fis);

	}

}
