package Part_3;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("\033[35m\nPart 3.1:\nBig O:\033[0m");
        System.out.println("""
                To prove that f(n) = 2.5n + 4 is O(n), we need to show that there exist constants C and n0 
                such that for all values of n greater than or equal to n0, the function f(n) is bounded above by C * g(n),
                where g(n) is a function of n.
                Let's choose g(n) = n and C = 3. We want to find an appropriate value for n0.
                                
                For any value of n, we have:
                2.5n + 4 ≤ 3n
                                
                After solving it we have:
                8 ≤ n
                                
                So, if we choose n0 = 8, for all values of n greater than or equal to 8, we have:
                2.5n + 4 ≤ 3n
                                
                Thus, we have shown that f(n) = 2.5n + 4 is O(n) with C = 3 and n0 = 8.
                """);
    }
}
