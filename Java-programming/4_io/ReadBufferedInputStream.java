import java.io.*;

public class ReadBufferedInputStream {

    public static void main(String[] args) {

        //create file object
        File file = new File("C://ReadFile.txt");
        BufferedInputStream bin = null;

        try
        {
            //create FileInputStream object
            FileInputStream fin = new FileInputStream(file);

            //create object of BufferedInputStream
            bin = new BufferedInputStream(fin);

                        /*
                         * BufferedInputStream has ability to buffer input into
                         * internal buffer array.
                         *
                         * available() method returns number of bytes that can be
                         * read from underlying stream without blocking.
                         */

            //read file using BufferedInputStream
            while( bin.available() > 0 ){

                System.out.print((char)bin.read());
            }

        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found" + e);
        }
        catch(IOException ioe)
        {
            System.out.println("Exception while reading the file " + ioe);
        }
        finally
        {
            //close the BufferedInputStream using close method
            try{
                if(bin != null)
                    bin.close();

            }catch(IOException ioe)
            {
                System.out.println("Error while closing the stream : " + ioe);
            }


        }
    }

}


/*
Output:
File content

*/