//Euclid’s algorithm is used to find gcd. GCD(n,m) == GCD(m, n mod m)

public class GCD {

    public static int gcd(int m, int n)
    {
        if(m<n)
            return (gcd(n, m));
        if(m%n == 0)
            return (n);
        return(gcd(n, m%n));
    }
}
