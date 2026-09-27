class Hamming
{
    public static int Distance(String szo1, String szo2)
    {
        if (szo1.length() != szo2.length())
        {
            return -1;
        }
        int kulonbozik = 0;
        for (int i = 0; i < szo1.length(); ++i)
        {
            if (szo1.charAt(i) != szo2.charAt(i))
            {
                kulonbozik++;
            }
        }
        return kulonbozik;
    }
}


public class hamming2
{
    public static void main()
    {
        System.out.println(Hamming.Distance("toned", "roses"));
        System.out.println(Hamming.Distance("toned", "ros"));
    }
}
