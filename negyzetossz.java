public class negyzetossz
{
    public static int nosszeg()
    {
        int osszeg = 0;
        for (int i = 1; i <= 100; ++i)
        {
            osszeg += i*i;
        }
        return osszeg;
    }
    public static int osszegn()
    {
        int osszeg = 0;
        for (int i = 1; i <= 100; ++i)
        {
            osszeg += i;
        }
        osszeg *= osszeg;
        return osszeg;
    }
    public static void main()
    {
        System.out.println(osszegn());
        System.out.println(nosszeg());
        System.out.println(osszegn()-nosszeg());
    }   
}