import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E {
	int i = 10;
	public void test()throws FileNotFoundException,IOException,Exception{
		FileInputStream sfile = new FileInputStream("/home/edathadan/test.py");
		System.out.println((char)sfile.read());
	}

}
