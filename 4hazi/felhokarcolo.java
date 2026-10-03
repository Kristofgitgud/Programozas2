import java.util.Arrays;

public class felhokarcolo {
    public static void main()
    {
        int[] felhokarcolok = {2, 4, 8, 3, 9, 7, 1};
        System.out.println(Arrays.toString(felhokarcolok));
        System.out.println("");
        System.out.printf("A felhőkarcolók magasságkülönbsége: %d\n", magassagKulonbseg(felhokarcolok));

        String szam = "179769313486231590772930519078902473361797697894230657273430081157732675805500963132708477322407536021120113879871393357658789768814416622492847430639474124377767893424865485276302219601246094119453082952085005768838150682342462881473913110540827237163350510684586298239947245938479716304835356329624224137216";
        //System.out.println(szam);
        System.out.println("A nagy szám magasságkülönbsége: " + magassagKulonbseg(szam));
    }


    public static int magassagKulonbseg(int[] tomb)
    {
        int result = 0;
        if (tomb.length > 1)
        {
            for (int i = 0; i < tomb.length - 1; ++i)
            {
                result += Math.abs(tomb[i] - tomb[i + 1]);
            }
        }

        return result;
    }


    public static int magassagKulonbseg(String s)
    {
        int result = 0;
        if (s.length() > 1)
        {
            for (int i = 0; i < s.length() - 1; ++i)
            {
                result += Math.abs(Integer.parseInt(s.substring(i, i + 1)) - Integer.parseInt(s.substring(i + 1, i + 2)));
            }
        }

        return result;
    }
}
