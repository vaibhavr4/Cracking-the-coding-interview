import java.util.*;
import java.lang.Object;
public class MyClass {
    public static boolean palindromePermutation(String s)
    {
        s = s.replace(" ","");
        int count =0;
       Map<Character,Integer> map = new HashMap<Character,Integer>();
       for(int i=0;i<s.length();i++)
       {
           map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
       }
       for(char k: map.keySet()){
           count +=map.get(k)%2;
       }
       return count<=1;
    }
    public static void main(String args[]) {
        boolean out = palindromePermutation("taco cat");
        

        System.out.println(out);
    }
}
