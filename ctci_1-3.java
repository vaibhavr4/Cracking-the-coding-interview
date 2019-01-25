import java.util.*;
public class MyClass {
    public static String replaceStr(String s,int len)
    {
        s= s.substring(0,len);
       return s.replace(" ","%20");
    }
    public static void main(String args[]) {
        String out = replaceStr("Mr John Smith    ",13);
        

        System.out.println(out);
    }
}
