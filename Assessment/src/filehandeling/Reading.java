package filehandeling;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Reading {
		public static void main(String[] args) throws FileNotFoundException{
	        try
	        {
	        	File myobj = new File("Myfile.txt");
	        	Scanner myReader = new Scanner(myobj);
	        	while(myReader.hasNextLine())
	        	{
	        		String data = myReader.nextLine();
	        		System.out.println(data);
	        	}
	        	myReader.close();
	        }
	        catch(FileNotFoundException e)
	        {
	        	System.out.println("An Error Occured");
	        	e.printStackTrace();
	        }
	}

}