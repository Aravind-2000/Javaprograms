import java.util.*;
import java.lang.*;

public class FindType
{

    public ArrayList<String> retData(String str)
    {
        int scount = 0, icount = 0, dcount = 0;
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(str.split(" ")));
        for( int i = 0; i<arr.size();i++)
        {
            if (arr.get(i).matches("^[a-zA-Z]*$"))
            {
                scount += 1;
            }
            else if ( arr.get(i).matches("\\d+"))
            {
                icount += 1;
            }
            else if ( arr.get(i).matches("[0-9]*(.[0-9]*)?"))
            {
                dcount += 1;
            }
        }
        arr.clear();
        arr.add(Integer.toString(scount));
        arr.add(Integer.toString(icount));
        arr.add(Integer.toString(dcount));
        return arr;
    }
    public static void main(String[] args)
    {
        // Scanner sc = new Scanner(System.in);
        String str = "give me 22.2222 2222.0";
        FindType obj = new FindType();
        ArrayList<String> t = obj.retData(str);
        System.out.printf(" String: %s \n Integer: %s \n Double: %s", t.get(0),t.get(1),t.get(2));
    }

}
