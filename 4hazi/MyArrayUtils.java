public class MyArrayUtils
{


    public static void reverse(int[] tomb)
    {
        int temp;
        int j = tomb.length -1;
        for (int i = 0; i < tomb.length/2; ++i)
        {
            temp = tomb[i];
            tomb[i] = tomb[j - i];
            tomb[j - i] = temp;
        }
    }


    public static void sortDescending(int[] tomb)
    {
        sort(tomb);
        reverse(tomb);
    }


    public static void sort(int[] tomb)
    {
        for (int i = 0; i < tomb.length - 1; ++i)
        {
            for (int j = i + 1; j < tomb.length; j++)
            {
                if (tomb[i] > tomb[j])
                {
                    int temp = tomb[i];
                    tomb[i] = tomb[j];
                    tomb[j] = temp;
                }
            }
        }
    }


    public static boolean equals(int[] tomb1, int[] tomb2)
    {
        if (tomb1.length != tomb2.length)
        {
            return false;
        }
        for (int i = 0; i < tomb1.length; i++)
        {
            if (tomb1[i] != tomb2[i])
            {
                return false;
            }
        }
        return true;
    }


    public static void fill(int[] tomb, int szam)
    {
        for (int i = 0; i < tomb.length; i++)
        {
            tomb[i] = szam;
        }
    }


    public static int getMinElem(int[] tomb)
    {
        int minimum = tomb[0];
        for (int i = 0; i < tomb.length; i++)
        {
            if (tomb[i] < minimum)
            {
                minimum = tomb[i];
            }
        }
        return minimum;
    }


    public static int getMaxElem(int[] tomb)
    {
        int max = tomb[0];
        for (int i = 0; i < tomb.length; i++)
        {
            if (tomb[i] > max)
            {
                max = tomb[i];
            }
        }
        return max;
    }

    public static boolean isSorted(int[] tomb)
    {
        for (int i = 0; i < tomb.length - 1; ++i)
        {
            if (tomb[i] > tomb[i + 1])
            {
                return false;
            }
        }
        return true;
    }
}
