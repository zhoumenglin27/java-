import java.util.ArrayList;
import java.util.HashMap;

public class sequense {
    public long maximumSubsequenceCount(String text, String pattern) {
    long s=0;
    long m=0,n=0;
    ArrayList<Character> reco=new ArrayList<Character>();
    for(int i=0;i<text.length();i++){
        if(text.charAt(i)==pattern.charAt(0)){
            m++;
            reco.add(pattern.charAt(0));
        }
        else if(text.charAt(i)==pattern.charAt(1)){
            n++;
            reco.add(pattern.charAt(1));
        }
    }
    System.out.println(reco);
    if(pattern.charAt(0)==pattern.charAt(1)) {
      if(m==1) {
          s = 1;
      }
       else{
         s=(m+1)*m;
      }
    }
    else {
        if (m == 0 && n == 0)
            s = 0;

        else if (m == 0 || n == 0) {
            s = Math.max(m * (n + 1), n * (m + 1));

        }
        else {
            for (int j = 0; j < reco.size() - 1; j++) {
                if (reco.get(j) == pattern.charAt(0)) {
                    for (int x = j + 1; x < reco.size(); x++) {
                        if (reco.get(x) == pattern.charAt(1))
                            s += 1;

                    }
                }
            }
            s = s + Math.max(m, n);
        }
    }
    return s;
    }

}

