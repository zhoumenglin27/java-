public class scoreOfString {
    public scoreOfString(String hello) {
    }

    public int scoreOfString(String s) {
        char ss[]= s.toCharArray();
        int score=0;
        for(int i=0;i+1<s.length();i++){

                score+=Math.abs(ss[i]-ss[i+1]);
        }
        return score;
    }
}
