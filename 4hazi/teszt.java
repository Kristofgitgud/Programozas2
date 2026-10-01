import java.util.ArrayList;

public class teszt {
    public static void main()
    {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        
        lista = PyUtils.range(0, 0);
        System.out.println(lista.toString());
        lista = PyUtils.range(10);
        System.out.println(lista.toString());
        lista = PyUtils.range(12, 10, 2);
        System.out.println(lista.toString());
    }
}
