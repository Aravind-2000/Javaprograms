import java.util.*;
import java.lang.*;


public class CommonChildProb {

    public Integer commonChild(String s1, String s2)
    {
        int[][] C = new int[s1.length()+1][s2.length()+1];

        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    C[i+1][j+1] = C[i][j] + 1;
                } else {
                    C[i+1][j+1] = Math.max(C[i+1][j], C[i][j+1]);
                }
            }
        }
        for (int i = 0; i < s1.length(); i++) {
        }

        return C[s1.length()][s2.length()];


    }

        public static void main (String[] args)
        {
            String s1 = "OUDFRMYMAW";
            String s2 = "AWHYFCCMQX";
            CommonChildProb C = new CommonChildProb();
            System.out.println(C.commonChild(s1, s2));
    }
}