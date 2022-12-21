/**
 * Created by codebind.com.
 */
import java.io.File;
public class Permission {
    public static void main(String[] args) {
        File myFile = new File("C:" + File.separator + "jdk" + File.separator, "FileName.java");
        System.out.println("is File : " +myFile.isFile());
        System.out.println("is Hidden : " +myFile.isHidden());
        if(myFile.exists()) {
            System.out.println("Can File Execute : " + myFile.canExecute());
            System.out.println("Can File Write : " + myFile.canWrite());
            System.out.println("Can File Read : " + myFile.canRead());
        }

        myFile.setExecutable(false);  // returns true if and only if the operation succeeded.
        myFile.setReadable(false);    // returns true if and only if the operation succeeded.
        myFile.setWritable(false);    // returns true if and only if the operation succeeded.


        System.out.println("Can File Execute : " + myFile.canExecute());
        System.out.println("Can File Write : " + myFile.canWrite());
        System.out.println("Can File Read : " + myFile.canRead());

    }
}