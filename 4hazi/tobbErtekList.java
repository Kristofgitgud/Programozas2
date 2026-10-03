import java.util.ArrayList;
import java.util.List;

public class tobbErtekList {
    public static void main()
    {
        List<Integer> szamok = new ArrayList<Integer>(List.of(5, 6, 3, 9, 4, 2, 7, 99));
        szamok.add(1);

        System.out.println(szamok);
        List<Integer> minMax = getMinAndMax(szamok);
        System.out.printf("A lista minimuma: %d\nA lista maximuma: %d\n", minMax.get(0), minMax.get(1));
    }

    public static List<Integer> getMinAndMax(List<Integer> lista)
    {
        int szam = lista.get(0);
        int min = szam;
        int max = szam;
        for (int i = 1; i < lista.size(); ++i)
        {
            szam = lista.get(i);
            if (min > szam) min = szam;
            else if (max < szam) max = szam;
        }
        List<Integer> result = new ArrayList<Integer>(List.of(min, max));
        return result;
    }
}
