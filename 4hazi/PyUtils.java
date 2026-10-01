import java.util.ArrayList;
import java.util.Arrays;

public class PyUtils
{
    

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
}