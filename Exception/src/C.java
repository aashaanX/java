import java.io.FileOutputStream;
import java.io.IOException;

public class C {
	public static void main(String[] args) {
		FileOutputStream sFile = null;
		try{
			sFile = new FileOutputStream("/home/edathadan/File_input.txt");
			System.out.println("File opened to write");
			String str = "unni6";
			byte[] data = str.getBytes();
			sFile.write(data);
			System.out.println("Data written to file");
		}catch(Exception e){
			System.out.println(e);
		}finally{
			if (sFile!=null){
				try {
					sFile.close();
					System.out.println("File Closed");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println(e);
					System.out.println("Exception while closing File");
				}
			}
		}
	}
}
// Class to input data to a file.
// data is first converted to bytes using '.getBytes()' method
// then this data is written into file using '.write()' method
// Note Try - catch is important for opening a file due to I/O exception
//