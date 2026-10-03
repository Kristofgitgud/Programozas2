import java.util.ArrayList;
import java.util.List;

public class tobbErtekTomb {
    public static void main()
    {
        List<Integer> szamok = new ArrayList<Integer>(List.of(5, 6, 3, 9, 4, 2, 7, 99));
        szamok.add(1);

        System.out.println(szamok);
        int[] minMax = getMinAndMax(szamok);
        System.out.printf("A lista minimuma: %d\nA lista maximuma: %d\n", minMax[0], minMax[1]);
    }

    public static int[] getMinAndMax(List<Integer> lista)
    {
        int szam = lista.get(0);
        int min = szam;
        int max = szam;
        int[] result = new int[2];
        for (int i = 1; i < lista.size(); ++i)
        {
            szam = lista.get(i);
            if (min > szam) min = szam;
            else if (max < szam) max = szam;
        }
        result[0] = min;
        result[1] = max;
        return result;
    }
}
