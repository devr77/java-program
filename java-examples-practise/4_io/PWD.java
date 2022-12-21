/**
 * Created by codebind.com.
 */
import java.io.File;
public class PWD {
    public static void main(String[] args) {
        File myFile = new File("C:" + File.separator + "jdk" + File.separator, "FileName.java");
        System.out.println(myFile.getParent());
        System.out.println(myFile.getParentFile());
        System.out.println(myFile);
    }
}