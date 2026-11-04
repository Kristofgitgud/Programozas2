class FizzBuzz 
{

    int felsoLimit;
    public FizzBuzz(int meddig)
    {
        this.felsoLimit = meddig;
    }
    public void Start()
    {
        for (int i = 1; i < felsoLimit; ++i)
        {
            if (i % 3 == 0 && i % 5 == 0)
            {
                System.out.println("fizzbuzz");
            }
            else if (i % 3 == 0)
            {
                System.out.println("fizz");
            }
            else if (i % 5 == 0)
            {
                System.out.println("buzz");
            }
            else System.out.println(i);
        }
    }
}


public class fizzbuzz {
    public static void main()
    {
        FizzBuzz fb = new FizzBuzz(100);
        fb.Start();
    }
}
