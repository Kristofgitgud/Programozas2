import java.util.ArrayList;

public class teszt {
    public static void main()
    {
        int[] szamok = {1, 3, 4, 5};
        ArrayList<Integer> lista = new ArrayList<Integer>();
        
        /*lista = PyUtils.range(0, 0);
        System.out.println(lista.toString());
        lista = PyUtils.range(10);
        System.out.println(lista.toString());
        lista = PyUtils.range(12, 10, 2);
        System.out.println(lista.toString());*/
        System.out.println(MyArrayUtils.getMinElem(szamok));

        System.out.println(MyArrayUtils.isSorted(szamok));

    }
}
