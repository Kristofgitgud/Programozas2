public class dia{
    public static void main()
    {
        diamond(4);
    }


    public static void diamond(int n)
    {
        if (n%2 == 0)
        {
            System.err.println("Hiba! Csak páratlan számot lehet megadni.");
            return;
        }
        int csillag = 1;
        for (int i = 0; i < n; ++i)
        {   
            System.out.print(" ".repeat(n/2-csillag/2));
            System.out.println("*".repeat(csillag));
            if (i < n/2)
            {
                csillag += 2;
            }
            else
            {
                csillag -= 2;
            }
        }

    }
}