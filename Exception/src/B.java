
import java.io.FileInputStream;
import java.io.IOException;

public class B {
	public static void main(String[] args) {
		//FileInputStream sFile = new FileInputStream("/home/edathadan/test.py");
		FileInputStream sFile = null;
		try{
			sFile = new FileInputStream("/home/edathadan/test.py");
			int i = sFile.read();
			System.out.println(i);
		}
		catch (Exception e){
			System.out.println(e);
			System.out.println("lol");
		}finally{
			System.out.println(sFile);
			if (sFile!=null){
				try {
					sFile.close();
					System.out.println("file closed");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}

// Class will read first byte from the file and display it on the screen
// the data read will be in byte type cast will be done to convert it in to char
// Doubt : how will we convert if there are both char and numbers.