public class StringUtils {


    public static String randomCase(String s)
    {
        StringBuilder sb = new StringBuilder();
        for (char betu : s.toCharArray())
        {
            if (Math.random() < 0.5)
            {
                sb.append(Character.toLowerCase(betu));
            }
            else
            {
                sb.append(Character.toUpperCase(betu));
            }
        }
        return sb.toString();
    }
}
