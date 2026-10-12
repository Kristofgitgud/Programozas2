import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PyUtils
{
    private PyUtils(){
        //Nem példányosítható
    }

    public static ArrayList<Integer> range(int mettol, int meddig)
    {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = mettol; i < meddig; ++i)
        {
            result.add(i);
        }
        
        return result;
    }

    
    public static ArrayList<Integer> range(int meddig)
    {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < meddig; ++i)
        {
            result.add(i);
        }
        
        return result;
    }


    public static ArrayList<Integer> range(int mettol, int meddig, int lepeskoz)
    {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = mettol; i < meddig; i += lepeskoz)
        {
            result.add(i);
        }
        
        return result;
    }


    public static String input(String s)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print(s);
        String visszaad = scanner.nextLine();
        return visszaad;
    }


    public static String input()
    {
        Scanner scanner = new Scanner(System.in);
        String visszaad = scanner.nextLine();
        return visszaad;
    }
}