import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;



public class Main
{
    public static void main(String[] args)
    {

        File file = new File("C:\\Users\\Student\\IdeaProjects\\Chess\\123.txt");

        try
        {
            try (BufferedReader br = new BufferedReader(new FileReader(file)))
            {
                String line;
                while ((line = br.readLine()) != null)
                {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {e.printStackTrace();}


    }
}