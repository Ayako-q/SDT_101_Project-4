/*
This is Oleksii Ishchneko code
Part 1 - 1.1 (Recursion sum) and 1.2 (Recursion x^n)
 */

package Part_1;

public class Main
{
    public static void main(String[] args)
    {
        // Part 1.1 - Recursion
        Recursion recursion = new Recursion();
        System.out.println("Part 1.1:\nSum 1 to N when N = 10: " + recursion.sum1toN(10));
        System.out.println("Part 1.2:\nx^n where x is 5 and n is 9: " + recursion.power(5,9));
    }
}
