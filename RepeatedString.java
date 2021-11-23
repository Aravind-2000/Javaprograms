import java.io.IOException;
import java.util.*;

public class RepeatedString
{
    public static long countdown(String s, long n) {
        ArrayList<Character> ar = new ArrayList<>();
        int i;
        long count = 0;
        while (ar.size() <= n) {
            for (i = 0; i < s.length(); i++) {
                ar.add(s.charAt(i));
            }
        }
        for (int j = 0; j < n; j++) {
            if (ar.get(j) == 'a') {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
        String s = "a";
        long n = 1000000000L;
        System.out.println(countdown(s,n));
    }
}


