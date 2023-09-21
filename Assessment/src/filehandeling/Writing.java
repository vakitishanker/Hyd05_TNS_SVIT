package filehandeling;
import java.io.FileWriter;
import java.io.IOException;

public class Writing {
		public static void main(String[] args) throws IOException{
			try
			{
				FileWriter myWriter = new FileWriter("Myfile.txt");
				myWriter.write("writing into the file");
			    myWriter.close();
			    System.out.println("Successfully written into file");
			}
			catch(IOException e)
			{
				System.out.println("Error Occured!!!");
				e.printStackTrace();
			}
			
	}

}
