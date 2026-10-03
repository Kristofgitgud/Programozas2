import java.util.ArrayList;
import java.util.List;

class Pair{
    int n1;
    int n2;
    public Pair(int n1, int n2)
    {
        this.n1 = n1;
        this.n2 = n2;
    }
}

public class tobbErtekClass {
    public static void main()
    {
        List<Integer> szamok = new ArrayList<Integer>(List.of(5, 6, 3, 9, 4, 2, 7, 99));
        szamok.add(1);

        System.out.println(szamok);
        Pair minMax = getMinAndMax(szamok);
        System.out.printf("A lista minimuma: %d\nA lista maximuma: %d\n", minMax.n1, minMax.n2);
    }

    public static Pair getMinAndMax(List<Integer> lista)
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
        Pair result = new Pair(min, max);
        return result;
    }
}
