import java.util.*;

public class JumpingClouds
{
    public static int jumps(ArrayList<Integer> arr ){
        int i, count = 0;
        for(i=0;i<arr.size();i++) {
            if (arr.get(i) == 0 ) {
                count++;
                if(i !=0 && i != arr.size()-1) {
                    if (arr.get(i + 1) == 0 && arr.get(i - 1) == 0) {
                        arr.set(i,1);
                        count--;
                    }
                }
            }
        }
        return count-1;
    }
    public static void main(String[] args){
        //ArrayList<Integer> arr = new ArrayList<>(List.of(0,0,1,0,0,1,0));
//        JumpingClouds ob = new JumpingClouds();
        System.out.println(jumps(new ArrayList<>(List.of(0,0,1,0,0,1,0))));

    }
}
