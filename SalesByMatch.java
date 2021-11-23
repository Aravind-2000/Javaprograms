import java.util.*;
import java.lang.*;

public class SalesByMatch
{
    public Integer byMatch( List<Integer> ar)
    {
        int count = 0;
        int i,j;
        for(i=0; i<ar.size();i++) {
            if(ar.get(i) != 0){
                for(j=i+1; j<ar.size();j++) {
                    if (ar.get(i).equals(ar.get(j))) {
                        ar.set(j,0);
                        count++;
                        break;}}}}
        return count;
    }
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>(List.of(10, 20, 20, 10, 10, 30, 50, 10, 20));
        SalesByMatch ob = new SalesByMatch();
        System.out.println(ob.byMatch(arr));
    }

}
