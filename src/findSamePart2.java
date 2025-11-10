public class findSamePart2 {    /*做错了，需要再做一次*/
    public int strStr(String haystack, String needle) {
        int returnNum=-1,haylen,neelen;
        haylen=haystack.length();
        neelen=needle.length();
        if(haylen<neelen)
            returnNum=-1;
        else if (haylen==neelen){
            for(int i=0;i<=haylen-1;i++){
                returnNum=0;
                if (haystack.charAt(i)!=needle.charAt(i)){
                    returnNum=-1;
                    break;
                }
            }
        }
        else {
            for(int i=0;i<=haylen-neelen;i++){
                boolean y=true;returnNum=i;
                for(int j=0;j<=neelen-1;j++){
                    if(haystack.charAt(i+j)!=needle.charAt(j)){
                        y=false;returnNum=-1;
                        break;
                    }
                }
                if(y==true){
                    break;
                }
            }
        }


        return returnNum;
    }
}

