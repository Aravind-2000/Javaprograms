import java.util.*;

public class access_array
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i;
        String[] nameList = new String[100];
        for(i=0; i<5;i++){
            nameList[i] = sc.next();
        }
        System.out.println(nameList[0]);
        System.out.println(nameList[1]);
        System.out.println(nameList[2]);

    }
}
