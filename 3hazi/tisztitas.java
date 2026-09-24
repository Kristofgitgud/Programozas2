public class tisztitas {
    public static void main()
    {
    //System.out.println(tisztit("kenyer baj\nsajt"));
    System.out.println(tisztit("192.20.246.138:\n 6666"));
    }


    public static String tisztit(String alap)
    {
        String tisztitott = "";

        for (int i = 0; i < alap.length(); ++i)
        {
            if (alap.charAt(i) != '\n' && alap.charAt(i) != ' ')
            {
                tisztitott = tisztitott + alap.charAt(i);
            }
        }
        return tisztitott;
    }
}
