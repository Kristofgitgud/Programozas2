public class wrapperek {
    public static void main()
    {
        char karakter = 'A';
        int a = 2;
        int b = 5;
        double tort = 3.14;
        double tort2 = 2.36;
        boolean bool1 = true;
        boolean bool2 = false;
        elvalaszto();
        System.out.printf("A Character wrapper isLowerCase metódusa visszaad egy booleant, aszerint hogy a karakter kisbetűs e.\nCharacter.isLowerCase(%c) = %b\n",karakter, Character.isLowerCase(karakter));
        elvalaszto();

        System.out.printf("A Character wrapper isUpperCase metódusa visszaad egy booleant, aszerint hogy a karakter nagybetűs e.\nCharacter.isUpperCase(%c) = %b\n",karakter, Character.isUpperCase(karakter));
        elvalaszto();

        System.out.printf("Az Integer wrapper max metódusa visszaadja 2 szám közül a nagyobbat.\nInteger.max(%d, %d) = 5\n", a, b, Integer.max(a, b));
        elvalaszto();

        System.out.printf("Az Integer wrapper min metódusa visszaadja 2 szám közül a kisebbiket.\nInteger.min(%d, %d) = %d\n", a, b, Integer.min(a, b));
        elvalaszto();
        
        System.out.printf("A Double wrapper toString metódusa visszatérési értéke a törtszám stringgé alakítva.\nDouble.toString(%f) = %s\n", tort, Double.toString(tort));
        elvalaszto();

        System.out.printf("A Double wrapper sum metódusa összead két doublet\nDouble.sum(%f, %f) = %f\n", tort, tort2, Double.sum(tort, tort2));
        elvalaszto();

        System.out.printf("A Boolean wrapper logicalOr metódusa visszaad egy boolean-t, melynek értéke (bool1 OR bool2)\nBoolean.logicalOr(%b, %b) = %b\n", bool1, bool2, Boolean.logicalOr(bool1, bool2));
        elvalaszto();

        System.out.printf("A Boolean wrapper logicalAnd metódusa visszaad egy boolean-t, melynek értéke (bool1 And bool2)\nBoolean.logicalAnd(%b, %b) = %b\n", bool1, bool2, Boolean.logicalAnd(bool1, bool2));
        elvalaszto();
    }
    
    
    public static void elvalaszto()
    {
        System.out.println();
        for (int i = 0; i < 50; i++)
        {
            System.out.printf("-");
        }
        System.out.println();
        System.out.println();
    }
}
