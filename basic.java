import java.util.*;
import java.io.*;
import java.lang.*;

public class basic
{
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
//        Linear Search
//        int j;
//        int[] num = new int[]{2,32,54,98,9,55,76,56};
//        int n = 54;
//        for (j=0; j<num.length;j++) {
//            if (n == num[j]) {
//                System.out.println("The number is found " + num[j]);
//                break;
//            }
//        }if(j == num.length){
//            System.out.println("The number "+n+" is not found");
//         }

        //Bubble Sort
         int temp, i, j ;
        int[] num = new int[]{900,43,65,12,67,33,98};
        for(i=0; i<num.length;i++){
            for(j=i+1; j< num.length;j++){
                // This is for  Ascending order and for descending order change the operator ">" in the condition
                if(num[j] < num[i]){
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;}}}
        for(int k : num){
            System.out.println(k);
        }

    }
}
