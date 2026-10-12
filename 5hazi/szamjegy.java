public class szamjegy{
    public static void main()
    {
        
        String s = "90146852";
        System.out.println(s);

        System.out.printf("A számjegyek összege: %d\n", szamjegyekOsszege(s));

        System.out.printf("A számjegyek összege: %d\n", szamjegyekOsszege2(s));

        System.out.printf("A számjegyek összege: %d\n", szamjegyekOsszege3(s));

    }


    public static int szamjegyekOsszege(String s)
    {
        int result = 0;
        for (int i = 0; i < s.length(); i++)
        {
            result += Character.getNumericValue(s.charAt(i));
        }

        return result;
    }


    public static int szamjegyekOsszege2(String s)
    {
        int result = 0;
        for (int i = 0; i < s.length(); i++)
        {
            result += s.charAt(i) - '0';
        }

        return result;
    }


    public static int szamjegyekOsszege3(String s)
    {
        int result = 0;
        for (int i = 0; i < s.length(); i++)
        {
            result += Integer.parseInt(s.substring(i, i+1));
        }

        return result;
    }
}