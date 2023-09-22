import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


/**
 * A program that implements the sieve of Eratosthenes.
*/
public class Sieve
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Compute primes up to which integer?");
        int n = in.nextInt();
        HashSet<Integer> numbers = new HashSet<Integer>();

        for (int i = 2; i <= n; i++)
            numbers.add(i);


        for (int i = 2; i <= n; i++)
            for (int j = 2*i; j <= n; j += i)
                numbers.remove(j);

        System.out.print(numbers);

    }
}
