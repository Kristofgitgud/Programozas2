public class cserecase {
    public static void main()
    {
        String s = PyUtils.input("Adj meg egy szöveget! ");
        System.out.println(swapCase(s));
    }


    /*public static void swapCase(String s)
    {
        for (Character c : s.toCharArray())
        {
            if (Character.isLowerCase(c))
            {
                Character.toUpperCase(c);
            }
            else if (Character.isUpperCase(c))
            {
                Character.toLowerCase(c);
            }
        }
    }*/


    public static String swapCase(String s)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); ++i)
        {
            char betu = s.charAt(i);
            if (Character.isLowerCase(betu) && Character.isAlphabetic(betu))
            {
                sb.append(Character.toUpperCase(betu));
            }
            else if (Character.isUpperCase(betu) && Character.isAlphabetic(betu))
            {
                sb.append(Character.toLowerCase(betu));
            }
            else
            {
                sb.append(betu);
            }
        }

        return sb.toString();
    }
}
