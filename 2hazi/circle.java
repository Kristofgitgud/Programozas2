import java.util.Scanner;

class Circle
{
    double sugar;
    public Circle(double sugar)
    {
        this.sugar = sugar;
    }
    public double kerulet()
    {
        return 2 * Math.PI * sugar;
    }
    public double terulet()
    {
        return sugar * sugar * Math.PI;
    }
}

public class circle
{
    public static void main()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add meg a kör sugarát!");
        double r = scanner.nextDouble();

        Circle circle = new Circle(r);
        System.out.println("A kör kerülete: " + circle.kerulet());
        System.out.println("A kör területe: " + circle.terulet());
    }
}