import java.util.Arrays;
import java.util.Scanner;

public class basicsums
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Factorial
        int fact = 1 ,i;
        int n = sc.nextInt();
        for(i=1; i<=n; i++){
            fact = fact * i;
        }System.out.println(fact);
        Sorting in acseding order
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            int val = sc.nextInt();
            arr[i] = val;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); */

        int n = 5, temp;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Values: ");
            int val = sc.nextInt();
            arr[i] = val;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.stream(arr).max());
    }

}
