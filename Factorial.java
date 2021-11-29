import java.util.*;

public class Factorial
{
    public static void main(String[] args)
    {
        int  fact=1, num=5;
        while(num > 1)
        {
            fact = fact * num;
            num = num - 1;
        }
        System.out.println("The factorial is " + fact);
    }
}
