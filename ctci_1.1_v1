import java.util.*;
public class MyClass {
    public static boolean checkDuplicate(String s)
    {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        for(int i=0;i<c.length-1;i++)
        {
            if(c[i]==c[i+1])
                return false;
        } 
        return true;
    }
    public static void main(String args[]) {
        boolean out = checkDuplicate("how are");
        

        System.out.println(out);
    }
}
