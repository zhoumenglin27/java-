import java.util.ArrayList;
import java.util.HashMap;

public class roMaJi {
    public int romanToInt(String s) {
        int num=0;
        HashMap<Character,Integer> con=new HashMap<Character,Integer>();
        con.put('I',1);
        con.put('V',5);
        con.put('X',10);
        con.put('L',50);
        con.put('C',100);
        con.put('D',500);
        con.put('M',1000);
        for(int i=0;i<s.length();i++){
            if(i==s.length()-1)
                num=num+con.get(s.charAt(i));
           else {
               int m = con.get(s.charAt(i)), n = con.get(s.charAt(i + 1));
               if (m < n) {
                   num = num + n - m;
                   i++;
               }
               else{
                   num = num + m ;
               }
           }
        }
        return  num;
    }
}
