import java.util.Scanner;

class Gomb
{
    double r;
    public Gomb(double r)
    {
        this.r = r;
    }
    double felszin()
    {
        return 4 * Math.PI * r * r;
    }
    double terfogat()
    {
        return r * r * r * 4 / 3 * Math.PI;
    }
}

public class gomb
{
    public static void main()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add meg a gömb sugarát!");
        double sugar = scanner.nextDouble();

        Gomb g1 = new Gomb(sugar);
        System.out.println("A gömb felszíne: " + g1.felszin());
        System.out.println("A gömb térfogata: " + g1.terfogat());
    }
}