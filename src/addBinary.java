public class addBinary {
    public String addBinary(String a, String b) {
       int alen=a.length(),x=0;
        StringBuilder result = new StringBuilder();
       if(b.length()>a.length())
           alen=b.length();
        int[]res=new int[alen];
        int[]ain=new int[alen];int[]bin=new int[alen];
       for(int i=0;i<alen;i++){
           if(a.length()-1-i>=0){
           ain[alen-1-i]=Integer.parseInt(String.valueOf(a.charAt(a.length()-1-i)));}
           else
               ain[alen-1-i]=0;
           if(b.length()-i-1>=0){
               bin[alen-1-i]=Integer.parseInt(String.valueOf(b.charAt(b.length()-1-i)));}
           else
               bin[alen-1-i]=0;
           res[alen-1-i]=(ain[alen-1-i]+bin[alen-1-i]+x)%2;
           if((ain[alen-1-i]+bin[alen-1-i]+x)/2==1)
               x=1;
           else
               x=0;
           result.insert(0,res[alen-1-i]);
       }
       if(x==1){
           result.insert(0,'1');
       }
       return result.toString();
    }
}
