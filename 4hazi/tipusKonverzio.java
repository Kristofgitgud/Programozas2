public interface tipusKonverzio {
    public static void main()
    {
        /*"123"   -> long
        "3.14"  -> float
        "7.89"  -> double
        "a"     -> char */
        long a = Long.parseLong("123");
        float b = Float.parseFloat("3.14");
        double c = Double.parseDouble("7.89");
        char d = "a".charAt(0);

    }
}
