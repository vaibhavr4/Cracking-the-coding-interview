import java.util.*;
import java.lang.Object;
public class MyClass {
    public static boolean palindromePermutation(String s)
    {
        s = s.replace(" ","");
        char[] ch = s.toCharArray();
        int temp =0;
        for(char c : ch)
        {
            int count = s.length() - s.replace(String.valueOf(c), "").length();
            if(count%2!=0)
                temp+=1;
            if(temp>1)
                return false;
        }
        return true;
    }
    public static void main(String args[]) {
        boolean out = palindromePermutation("taco cat");
        

        System.out.println(out);
    }
}