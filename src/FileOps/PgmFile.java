package FileOps;

import java.io.File;
import java.io.IOException;

public class PgmFile {
	public static void main(String[] args) throws IOException {
		File f=new File("D:\\Automation\\j2ee");
		boolean b=f.mkdirs();
		System.out.println(b);
		if(b==false) {
			File f1=new File("D:\\\\Automation\\\\j2ee\\sample.txt");
			f1.createNewFile();
		}
	}

}
