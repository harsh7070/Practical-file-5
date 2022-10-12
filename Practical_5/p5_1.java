import java.io.File;
import java.io.IOException;

public class p5_1
{
    public static void main(String[] args) throws IOException {
        // creating new object of File class
        File f = new File("/Users/harsh/Documents/Practicals/Practical_5/Practical_5_1.txt");
        f.createNewFile();
        // gives file name
        System.out.println("File name :" + f.getName());
        // gives file path
        System.out.println("Path: " + f.getPath());
        // gives absolute file path
        System.out.println("Absolute path:" + f.getAbsolutePath());
        // gives path of parent folder
        System.out.println("Parent:" + f.getParent());
        // checks if the file exists
        System.out.println("Exists:" + f.exists());
        if(f.exists())
        {
            // checks if the file is writable
            System.out.println("Is writeable: " + f.canWrite());
            // checks if the file is readable
            System.out.println("Is readable: " + f.canRead());
            // checks if given path points to a directory
            System.out.println("Is a directory: " + f.isDirectory());
            // checks file size
            System.out.println("File Size in bytes: " + f.length());
            System.out.println("This program is created by 21CE039_Harsh");
        }

    }
}
