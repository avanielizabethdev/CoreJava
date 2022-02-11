package Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str1 = "Order confirmation 12345";
		FileOutputStream file1;
		
		try{
			file1= new FileOutputStream("results.txt",true);
			file1.write(str1.getBytes());
		}catch (FileNotFoundException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
