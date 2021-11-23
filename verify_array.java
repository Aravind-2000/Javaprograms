import java.util.Scanner;

public class verify_array
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        for (int i = 0; i<n; i++)
        {
            System.out.println("Enter the value in the array");
            int value = sc.nextInt();
            arr[i] = value;
        }
        System.out.println("Values in the Array are \n");
        for(int j=0; j<n; j++)
        {
            System.out.println(arr[j]);
        }
    }
}
