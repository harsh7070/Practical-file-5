import java.io.*;

public class p5_4_2
{
    public static void main(String[] args) throws IOException
    {


        FileInputStream sourceStream = null;
        FileOutputStream targetStream = null;

        try
        {
            sourceStream = new FileInputStream("/Users/harsh/Documents/Practicals/Practical_5/Practical_5_4.txt");
            targetStream = new FileOutputStream ("/Users/harsh/Documents/Practicals/Practical_5/copy1.txt");

            // reading from Practical_5_4.txt and writing in copy.txt and printing the byte in the program
            int temp;
            while ((temp = sourceStream.read()) != -1)
            {
                targetStream.write((byte)temp);
            }

        }
        finally
        {
            // closing the file if it is null
            if (sourceStream != null)
            {
                sourceStream.close();
            }

            if (targetStream != null)
            {
                targetStream.close();
            }

        }
        System.out.println("This program is created by 21CE039_Harsh");

    }
}
