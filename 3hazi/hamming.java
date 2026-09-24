class Hamming
{
    String szo1;
    String szo2;

    public Hamming(String szo1, String szo2)
    {
        if (szo1.length() != szo2.length())
        {
            System.out.println("Hiba! A két szó hossza nem egyezik, nincs Hamming távolság.");
        }
        else
        {
        this.szo1 = szo1;
        this.szo2 = szo2;
        }
    }
    public int Hossz()
    {
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


public class hamming
{
    public static void main()
    {
        Hamming h1 = new Hamming("toned", "roses");
        System.out.println(h1.Hossz());
    }
}