import java.util.Scanner;

class Negyzet
{
    int oldal;
    public Negyzet(int oldal)
    {
        this.oldal = oldal;
    }
    public int kerulet()
    {
        return 4 * oldal;
    }
    public int terulet()
    {
        return oldal * oldal;
    }
}


public class negyzet
{
    public static void main()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add meg a négyzet oldalhosszát!");
        int n = scanner.nextInt();
        Negyzet n1 = new Negyzet(n);
        //System.out.println("A négyzet oldala: " + n1.oldal);
        System.out.println("A négyzet kerülete: " + n1.kerulet());
        System.out.println("A négyzet területe: " + n1.terulet());
    }
}