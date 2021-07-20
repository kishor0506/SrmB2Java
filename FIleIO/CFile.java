package FIleIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CFile {

	public static void main(String[] args) throws IOException 
	{
		try 
		{
			File f=new File("‪‪F:\\file.txt");
			FileInputStream fis=new FileInputStream(f);
			FileOutputStream fos=new FileOutputStream("‪‪F:\\file1.txt");
			int i;
			while ((i=fis.read())!=-1)
			{
				fos.write(i);
			}
			System.out.println("File Copy compleleted...check in directory");
			fis.close();
			fos.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}

