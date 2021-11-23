import java.util.*;
import java.lang.*;

public class Swaps{

    public int minSwaps(int[] arr)
    {
        int count = 0;
        int temp, i, j ;
        for(i=0; i<arr.length;i++){
            for(j=i; j< arr.length;j++){
                // This is for  Ascending order and for descending order change the operator ">" in the condition
                if(arr[j] < arr[i]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp; count++;}}}
        return count;
    }
    public static void main(String[] args){

        int[] arry = new int[]{4, 3, 1, 2};
        Swaps obj = new Swaps();
        System.out.println(obj.minSwaps(arry));
    }

}
