
public class ezernelk 
{
    public static void main()
    {
        int osszeg = 0;
        for (int i = 0; i < 1000; ++i)
        {
            if (i%3 == 0 || i%5 ==0)
            {
                osszeg += i;
            }
        }
        System.out.println(osszeg);
    }
    
}
