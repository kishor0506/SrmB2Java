import java.io.BufferedReader;
import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Rfile {

	public static void main(String[] args) 
	{
		try {
		File f = new File("‪F:\\file.txt");
		BufferedReader br = new BufferedReader(new FileReader(f));    
	    int i;  
	    System.out.println("Contents in File: ");
	    while((i=br.read())!=-1){    
	     System.out.print((char)i);    
	    }    
	    System.out.println("\nIs File: "+f.isFile());
		System.out.println("\nIs File Exists :"+f.exists());
		if(f.exists())
		{
		    System.out.println("\nIs given File writeable: "+f.canWrite());
		    System.out.println("\nIs given File readable: "+f.canRead());
		    System.out.println("\nType of File: "+f.getName());
		    System.out.println("\nFile Size in bytes: "+f.length()); 
		}
		}catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}