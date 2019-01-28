import java.util.*;

public class MyClass {
    public static String compress(String s)
    {
    //char c = s.charAt(0);
    int count = 0;
    StringBuilder str = new StringBuilder();
    for(int i=0;i<s.length();i++)
    {
        
        count++;
        if(i + 1 >= s.length() || s.charAt(i) != s.charAt(i + 1))
        {
            str.append(s.charAt(i)).append(count);
            count = 0;
            
        }
    }
    return s.length()<str.toString().length()?s:str.toString();
 
} 
    
    public static void main(String args[]) {
        String out = compress("aabcccccaaa");
        

        System.out.println(out);
    }
}
