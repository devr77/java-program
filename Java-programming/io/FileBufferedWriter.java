/**
 * Created by codebind.com.
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileBufferedWriter {
    public static void main(String[] args) {
        BufferedWriter bw = null;
        try {
            String content = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
            //declare  the file name and path here
            File file = new File("D:/file_name.txt");

	       /* Tests whether the file or directory denoted by this abstract pathname exists.*/
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            bw.write(content);
            System.out.println("content written to the file Successfully");

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        finally
        {
            try{
                if(bw!=null)
                    bw.close();
            }catch(Exception ex){
                System.out.println("Error in closing the file Stream" + ex);
            }
        }
    }
}