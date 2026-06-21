package filehandling;
import java.io.*;
public class FileCreation {

	public static void main(String[] args) {
		/*File file=new File("C:\\Users\\Santhosh Kumar\\OneDrive\\Desktop\\folder1S\\sub1\\sub2");
		boolean present=file.exists();
		System.out.println("Folder presentL:"+present);
		if(present==false) {
			file.mkdirs();
			present=file.exists();
			System.out.println("Folder present:"+present);
		}*/
		/*File file=new File("C:\\Users\\Santhosh Kumar\\OneDrive\\Desktop\\folder1S\\sample.txt");
		boolean present=file.exists();
		if(present==false) {
			try {
				boolean created=file.createNewFile();
				System.out.println("File created"+created);
			}catch(IOException e) {
				e.printStackTrace();
			}
		}*/
		/*File file=new File("C:\\\\Users\\\\Santhosh Kumar\\\\OneDrive\\\\Desktop");
		File[] fileFolder=file.listFiles();
		for(File f:fileFolder)
			if(f.isFile()) {
				System.out.println(f);*/
		File file=new File("C:\\\\Users\\\\Santhosh Kumar\\\\OneDrive\\\\Desktop");
		File [] FileFolder=file.listFiles();
		for(File f:FileFolder) {
			if(f.isFile()) {
				String filename=f.getName();
				int lastdot=filename.lastIndexOf(".");
				String extension=filename.substring(lastdot);
				if(extension.equals("jpg"))
					System.out.println(filename);
			}
			}

	}

}
