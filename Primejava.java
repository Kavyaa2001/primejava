package Mycap;
import java.util.*;
public class Prime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please insert any number");
        int n = in.nextInt();
        int i, count=0;
        for (i = 2; i <= (n / 2); i++)
        {
            if (n % i == 0)
            {
                count++;
            }
        }
        if(count == 0)
        {
            System.out.println(+n +" is a prime number.");
        }
        else
            System.out.println(n +" is not a prime number.");
    }
}
