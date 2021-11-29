import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class arraylist
{
    public static ArrayList sort(ArrayList li)
    {
        Collections.sort(li);
        return li;
    }

    public static void main(String[] args)
    {
        ArrayList list1 = new ArrayList<Integer>(List.of(23,45,12,56,99,1));
        System.out.println(sort(list1));
    }
}
