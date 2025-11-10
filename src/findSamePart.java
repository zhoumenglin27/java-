public class findSamePart {
public findSamePart(){
}
public int strStr(String haystack, String needle) {
int returnNum;
if (haystack.indexOf(needle)==-1)
    returnNum=-1;
else
    returnNum=haystack.indexOf(needle);
    return returnNum;
}
}
