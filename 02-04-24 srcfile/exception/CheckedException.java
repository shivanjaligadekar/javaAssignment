package exception;

import java.io.FileInputStream;
import java.io.IOException;

public class CheckedException {

	public static void main(String[] args) throws IOException{
	
		FileInputStream fis=new FileInputStream("D:\\PriyaFile\\file1.txt");
		int k;
		while((k= fis.read()) !=-1) {//-1 is for end of file
			System.out.print((char)k);//typecast ascii into char
		}
		fis.close();
	}

}
