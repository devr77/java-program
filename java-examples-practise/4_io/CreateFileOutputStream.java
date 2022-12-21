/**
 * Created by codebind.com.
 */
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFileOutputStream {
    public static void main(String[] args) {
        //declare the file path here
        File file = new File("C:/myfile.txt");
        FileOutputStream fos = null;
        String content = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
        try {

            fos = new FileOutputStream(file);
          /* Tests whether the file or directory denoted by this abstract pathname exists.*/
            if (!file.exists()) {
                file.createNewFile();
            }

	  /* convert String content into bytes
	   */
            byte[] bytesArray = content.getBytes();

            fos.write(bytesArray);
            fos.flush();
            System.out.println("content written to the file Successfully");
        }
        catch (IOException ioex) {
            ioex.printStackTrace();
        }
        finally {
            try {
                if (fos != null)
                {
                    fos.close();
                }
            }
            catch (IOException ioe) {
                System.out.println("Error in closing the file Stream");
            }
        }
    }
}