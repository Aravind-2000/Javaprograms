import com.sun.source.tree.ArrayAccessTree;

import java.util.ArrayList;
import java.util.Scanner;

public class accessing_arrays
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of names that should be entered: ");
        int n = sc.nextInt();
        String[] list = new String[n];
        System.out.println("Enter the names: ");
        for(int i=0; i<n; i++) {
            String input = sc.next();
            list[i] = input;
        }
        System.out.println("Number of Names on the list "+n);
        System.out.println("The Names are");
        for (int j=0; j<n; j++) {
            System.out.println(list[j]);
        }
    }
}
