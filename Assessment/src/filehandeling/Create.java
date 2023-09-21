package filehandeling;
import java.io.File;
import java.io.IOException;


public class Create {
	
		public static void main(String[] args) throws IOException {
			try
			{
				File myobj = new File("Myfile.txt");
				if(myobj.createNewFile())
				{
					System.out.println("File created" + myobj.getName());
				}
				else
				{
					System.out.println("File already exists");
					System.out.println( myobj.getAbsolutePath());
				}
			}
			catch(Exception e)
			{
				System.out.println("An error occured");
				e.printStackTrace();
			}
		}

}

