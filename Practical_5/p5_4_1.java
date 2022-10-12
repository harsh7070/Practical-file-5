import java.io.*;
public class p5_4_1
{
    public static void main(String[] args) throws IOException
    {
        FileReader sourceStream = null;
        try
        {
            sourceStream = new FileReader("/Users/harsh/Documents/Practicals/Practical_5/Practical_5_4.txt");

            // reading from the file character by character
            int temp;
            while ((temp = sourceStream.read()) != -1)
            {
                System.out.println((char)temp);
            }

        }
        finally
        {
            // closing stream as no longer in use
            if (sourceStream != null)
            {
                sourceStream.close();
            }

        }
        System.out.println("This program is created by 21CE039_Harsh");

    }
}


