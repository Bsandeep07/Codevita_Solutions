public class factorial {
    public static int factorail(int n)
    {
        int value = 1;
        for (int i=n;i>=1;i--)
        {
            value = value * i;
        }
        return value;
    }

}
