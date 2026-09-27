public class matek {
    public static void main()
    {
        int a = 2;
        int b = 3;

        System.out.println("A Math.min(int n1, int n2) függvény visszatérési értékként megadja a két paraméter közül a legkisebbet.");
        System.out.printf("Math.min(2, 3)= %d\n", Math.min(a, b));

        elvalaszto(40);

        System.out.println("A Math.max(int n1, int n2) függvény visszatérési értékként megadja a két paraméter közül a legnagyobbat.");
        System.out.printf("Math.max(2, 3)= %d\n", Math.max(a, b));

        elvalaszto(40);

        System.out.println("A Math.abs(int n) függvény visszatérési értéke n, ha n nagyobb vagy egyenlő mint nulla, -n, ha n kisebb mint nulla.");
        System.out.printf("Math.abs(-122)= %d\n", Math.abs(-122));

        elvalaszto(40);

        System.out.println("A Math.powExact(int x, int n) függvény visszatérési értéke x az n-re emelve");
        System.out.printf("Math.powExact(2, 3)= %d\n", Math.powExact(a, b));
        System.out.println("Ha az érték integer túlcsorduláshoz vezetne, ArithmeticException hibát kapunk.");

        elvalaszto(40);

        System.out.println("A Math.floor(double n) függvény visszatérési értéke az a legnagyobb float, amely n-nél kisebb, vagy egyenlő, és egyenlő egy int-tel.");
        System.out.printf("Math.floor(3.14)= %f\n", Math.floor(3.14));
    }

    public static void elvalaszto(int n)
    {
        String jel = "-";
        System.out.println(jel.repeat(n));
    }
}
