import java.util.*;
import java.lang.*;

public class CountingValleys
{
    public int valleyCount(int steps, String path){
        int i, count = 0, ans = 0;
        for(i=0;i<path.length();i++){
            if (path.charAt(i) == 'U'){
                count++;
            }
            else if (path.charAt(i) == 'D'){
                count--;
            }
            if( path.charAt(i) == 'U' && count == 0){
                ans++;
            }
        }

        return ans;
    }

    public static void main(String[] args)
    {
        int steps = 8;
        String path = "DDUUDDUDUUUD";
        CountingValleys ob = new CountingValleys();
        System.out.println(ob.valleyCount(steps, path.toUpperCase()));
    }
}
