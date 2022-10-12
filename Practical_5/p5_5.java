import java.io.*;
import java.util.*;

public class p5_5
{
    public static void main(String[] args) throws IOException
    {
        // creating objects
        FileWriter writer = new FileWriter("/Users/harsh/Documents/Practicals/Practical_5/Even.txt");
        BufferedWriter buffer = new BufferedWriter(writer);

        // getting 15 numbers from the user
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 15 whole numbers: ");

        int[] num = new int[15];

        for(int i=0;i<15;i++)
        {
            num[i] = in.nextInt();
        }

        // printing even numbers in the file
        for(int i=0;i<15;i++)
        {
            if(num[i]%2 == 0)
            {
                buffer.write(num[i]);
            }
        }

        buffer.close();

        System.out.println("Content in the file is: ");

        // creating objects
        FileReader reader = new FileReader("/Users/harsh/Documents/Practicals/Practical_5/Even.txt");
        BufferedReader read = new BufferedReader(reader);

        int i;

        // printing the content in the output
        while((i=read.read()) != -1)
        {
            System.out.println(i);
        }
        System.out.println("This program is created by 21CE039_Harsh");

    }
}
