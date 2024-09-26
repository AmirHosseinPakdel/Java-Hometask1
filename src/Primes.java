public class Primes
{
    public static void main(String[] args)
    {
        int nValues = 50;
        outerLoop:
        for(int i = 2; i <= nValues; i++)
        {
            for (int j = 2; j < Math.sqrt(i+1); j++)
            {
                if (i % j == 0)
                {
                    continue outerLoop;
                }
            }
            System.out.println(i);
        }
    }
}