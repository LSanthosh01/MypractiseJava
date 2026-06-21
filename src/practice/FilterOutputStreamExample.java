package practice;
import java.io.*;

// 1. Create a custom class that extends FilterOutputStream
class UpperCaseOutputStream extends FilterOutputStream {
	public UpperCaseOutputStream(OutputStream out) {
		super(out);
	}

	// Override the write method to add custom behavior (e.g., converting to uppercase)
	@Override
	public void write(int b) throws IOException {
		super.write(Character.toUpperCase(b));
	}
}

public class FilterOutputStreamExample {

	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("filtered_output.txt");
			 UpperCaseOutputStream fosFiltered = new UpperCaseOutputStream(fos))
		{
			String content = "Hello, this is some content to write with additional formatting";
			byte[] data = content.getBytes();
			
			fosFiltered.write(data);
			fosFiltered.write('\n'); // Fix: Pass a single byte char instead of a String
			
			System.out.println("Content written to the file with additional formatting");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}