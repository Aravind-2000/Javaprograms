import java.util.*;
import java.lang.*;

public class test
{
    public Integer sum(ArrayList<Integer> arr, String str) {
        int sum_val = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ' ')
            {
                arr.add(Character.getNumericValue(str.charAt(i)));
            }
        }
        for(int j=0; j<arr.size(); j++)
        {
            sum_val = sum_val + arr.get(j);
        }
        return sum_val;
    }

    public  String sum(String str, char ch)
    {
        StringBuilder result = new StringBuilder();
        for(int k=0;k<str.length();k++)
        {
            if(str.charAt(k) != ' ')
            {
               result.append(str.charAt(k));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        test obj = new test();
        if (Character.toString(str.charAt(0)).matches("\\d+")) {
            System.out.println(obj.sum(arr, str));
        }
        else
        {
                System.out.println(obj.sum(str,ch));
        }
    }
}