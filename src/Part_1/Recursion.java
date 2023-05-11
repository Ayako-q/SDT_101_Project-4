// Part 1 - Recursion

package Part_1;

public class Recursion {
    // Part 1.1 - Recursion sum to 1
    public int sum1toN(int n)
    {
        if (n == 1)
        {
            return 1; // if one - we return one
        }
        else
        {
            return n + sum1toN(n - 1); // if it's not one - then we call a method one more time
        }
    }
    // Part 1.2 - Recursion x^n
    public double power(double x, int n)
    {
        if (n == 0)
        { // if n = 0 we return 1 cuz x^0 = 1
            return 1;
        }
        else if (n % 2 == 0)
        { // if n is even divide n by 2 and calculate the power recursively
            double y = power(x, n/2);
            return y * y;
        }
        else
        {
            return x * power(x, n-1); // when n is odd, calculate the power recursively with n-1
        }
    }
}
