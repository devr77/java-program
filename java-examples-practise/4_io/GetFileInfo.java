
import java.io.File;
public class GetFileInfo {
    public static void main(String[] args) {
        File myFile = new File("C:" + File.separator + "jdk" + File.separator, "FileName.java");
        System.out.println(myFile.getName());
        System.out.println(myFile.getPath());

    }
}