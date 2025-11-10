public class lengthOfLastWord {
    public lengthOfLastWord(){}
    public int lengthOfLastWord(String s) {
          int temp=s.length(),ans=0;
          for(int i=temp-1;i>=0;i--){
              if(s.charAt(i)==' '&&ans==0)
                  continue;
              else if (s.charAt(i)!=' ')
                  ans+=1;
              else break;
          }
          return  ans;
    }
}
