import java.util.*;

public class plusminus {
    public static void main(String[] args) {
        int[] arr = new int[]{-4, 3, -9, 0, 3, 1};
        int n = arr.length;
        float posc = 0 , negc=0 , zeroc=0 ;
        float posv, negv , zerov ;
        for (int j =0;j< arr.length;j++) {
            if (arr[j] < 0) {
                negc++;
            } else if (arr[j] > 0) {
                posc++;
            } else {
                zeroc++;
            }
        }
        posv = posc / n;
        negv = negc / n;
        zerov = zeroc / n;
        System.out.println(posv);
        System.out.println(negv);
        System.out.println(zerov);
    }
}


