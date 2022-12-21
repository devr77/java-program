
import java.io.File;
public class IsPathAbsolute
{
public static void main(String[] args)
    {
        File myFile = new File("C:" + File.separator + "jdk" + File.separator, "FileName.java");
        System.out.println(myFile.isAbsolute());
    }
}