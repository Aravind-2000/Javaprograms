import java.util.*;

public class MinDist
{
    public static int Result(ArrayList<Integer> arr)
    {
        int i, j ,currdis = 0;
        for(i=0; i<arr.size();i++)
        {
            for(j=i+1;j<arr.size();j++)
            {
                if(arr.get(i).equals(arr.get(j))) {
                    currdis = j - i;
                }
                else{
                    return -1;
                }
            }
        }
        return currdis;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(List.of(7, 1, 3, 4, 1, 7));
        System.out.println(Result(arr));
    }
}
