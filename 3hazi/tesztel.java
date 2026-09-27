import java.util.Arrays;

public class tesztel {

    
    public static void main()
    {
        //System.out.println(MyUtils.duplaz(8));
        //System.out.println(MyUtils.strlen("pipi"));

        int[] tomb = {1, 4, 3, 8, 5};
        int[] tomb2 = {1, 4, 3, 8, 5};
        int[] tomb3 = {30, 1, 13, 8, 5};

        // TÖMB sortDescending TESZTELÉSE

        System.out.println(Arrays.toString(tomb));
        //MyArrayUtils.sortDescending(tomb);
        System.out.println(Arrays.toString(tomb));

        // TÖMB equals TESZTELÉSE

        System.out.println(Arrays.toString(tomb) + " és " + Arrays.toString(tomb2) + " egyenlő?");
        System.out.println(MyArrayUtils.equals(tomb, tomb2));

        // TÖMB fill TESZTELÉSE

        int[] tomb4 = new int[4];
        System.out.println("Tömb fill előtt: " + Arrays.toString(tomb4));
        MyArrayUtils.fill(tomb4, 12);
        System.out.println("Tömb fill után: " + Arrays.toString(tomb4));
    }


    public int[] getOneToFive()
    {
        int[] tomb = {1, 2, 3, 4, 5};
        return tomb;
    }
}
