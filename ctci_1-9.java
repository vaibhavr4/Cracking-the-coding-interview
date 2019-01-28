import java.util.*;

public class MyClass {
    public static boolean strRotate(String s1, String s2)
    {
        String comb = s2+s2;
        return isSubstring(s1,comb);
    }
 
 public static boolean isSubstring(String s1, String s2)
 {
     int M = s1.length(); 
        int N = s2.length(); 
        for (int i = 0; i <= N - M; i++) { 
            int j; 
            for (j = 0; j < M; j++) 
                if (s2.charAt(i + j) != s1.charAt(j)) 
                    break; 
      
            if (j == M) 
                return true; 
        } 
      
        return false;
 }
 
    
    public static void main(String args[]) {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";
        boolean out = strRotate(s1,s2);
        System.out.println(out);
        
    }
}
