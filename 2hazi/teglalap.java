import java.util.Scanner;

class Teglalap
{
    int a;
    int b;
    public Teglalap(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
    int kerulet()
    {
        return 2 * a + 2 * b;
    }

    int terulet()
    {
        return a * b;
    }
}

public class teglalap
{
    public static void main()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add meg a téglalap két oldalát!");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        Teglalap t1 = new Teglalap(a, b);
        System.out.println("A téglalap kerülete: " + t1.kerulet());
        System.out.println("A téglalap területe: " + t1.terulet());
    }
}