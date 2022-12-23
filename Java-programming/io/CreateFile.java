import java.io.File;
import java.io.IOException;

public class CreateFile 
{
    public static void main( String[] args )
    {	
    	try {
    		 
	      File file = new File("C:\\fileName.txt");
	      
	      if (file.createNewFile()){
	        System.out.println("New File is created!");
	      }else{
	        System.out.println("File with the same name already exists.");
	      }
	      
    	} catch (IOException e) {
	      e.printStackTrace();
	}
    }
}