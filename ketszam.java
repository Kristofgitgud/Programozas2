import java.util.Scanner;

public class ketszam
{
    public static void main()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg két egész számot, enterrel elválasztva!");
        int szam1 = scanner.nextInt();
        int szam2 = scanner.nextInt();
        System.out.printf("%d\n", szam1 + szam2);
    }    
}
