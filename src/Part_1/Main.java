/*
This is Oleksii Ishchneko code
Part 1 - 1.1 (Recursion sum) and 1.2 (Recursion x^n)
LATE:
The reason why my project was late - I was experimenting with my code, so for submission
I created a new project to make it look cleaner. I pushed an empty project to GitHub and then
simply forgot to push it one more time when I've finished, sorry!
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
