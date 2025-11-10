import java.lang.reflect.Array;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String title;
        title="addBinary";
        if(title=="addBinary") {
            String s= "11";
            String s2= "1";
            addBinary a=new addBinary();
            System.out.printf(a.addBinary(s,s2));
        }
        if(title=="maxProfit") {
            int[]nums= {11,7,2,4,1};
            maxProfit a=new maxProfit();
            System.out.printf("%d",a.maxProfit(nums));
        }
        if(title=="plusOne") {
            int[]nums= {9,8,7,6,5,4,3,2,1,0};
            plusOne a=new plusOne();
            System.out.println(Arrays.toString(a.plusOne(nums)));
        }
        if(title=="lengthOfLastWord") {

            String s="   fly me   to   the moon  ";
            lengthOfLastWord a=new lengthOfLastWord();
            System.out.printf("%d",a.lengthOfLastWord(s));
        }
        if(title=="searchInsert2") {
        int[]nums= {1,3,5,6};
        int target=7;
        searchInsert a=new searchInsert();
            System.out.printf("%d",a.searchInsert(nums,target));
        }
        if (title=="sequense"){
            String t="vnedkpkkyxelxqptfwuzcjhqmwagvrglkeivowvbjdoyydnjrqrqejoyptzoklaxcjxbrrfmpdxckfjzahparhpanwqfjrpbslsyiwbldnpjqishlsuagevjmiyktgofvnyncizswldwnngnkifmaxbmospdeslxirofgqouaapfgltgqxdhurxljcepdpndqqgfwkfiqrwuwxfamciyweehktaegynfumwnhrgrhcluenpnoieqdivznrjljcotysnlylyswvdlkgsvrotavnkifwmnvgagjykxgwaimavqsxuitknmbxppgzfwtjdvegapcplreokicxcsbdrsyfpustpxxssnouifkypwqrywprjlyddrggkcglbgcrbihgpxxosmejchmzkydhquevpschkpyulqxgduqkqgwnsowxrmgqbmltrltzqmmpjilpfxocflpkwithsjlljxdygfvstvwqsyxlkknmgpppupgjvfgmxnwmvrfuwcrsadomyddazlonjyjdeswwznkaeaasyvurpgyvjsiltiykwquesfjmuswjlrphsdthmuqkrhynmqnfqdlwnwesdmiiqvcpingbcgcsvqmsmskesrajqwmgtdoktreqssutpudfykriqhblntfabspbeddpdkownehqszbmddizdgtqmobirwbopmoqzwydnpqnvkwadajbecmajilzkfwjnpfyamudpppuxhlcngkign",s="yy";
            sequense a=new sequense();
            System.out.printf("%d",a.maximumSubsequenceCount(t,s));
        }
        if (title=="roMaJi"){
            String s="MCMXCIV";
            roMaJi a=new roMaJi();
            //System.out.printf("%d",a.romanToInt(s));
        }
        if (title=="findSamePart2"){
            String haystack,needle;
            haystack="abc";
            needle="c";
            findSamePart2 a=new findSamePart2();
            System.out.printf("%d",a.strStr(haystack,needle));
        }
        if(title=="scorOfString") {
            String s="zaz";
            scoreOfString y = new scoreOfString(s);
            System.out.printf("字符串的分数：\n");
            System.out.printf("%d",y.scoreOfString(s));
        }
        if(title=="addTwoNumbers"){
           ListNode l17=new ListNode(9);
           ListNode l16=new ListNode(9,l17);
           ListNode l15=new ListNode(9,l16);
           ListNode l14=new ListNode(9,l15);
           ListNode l13=new ListNode(9,l14);
           ListNode l12=new ListNode(9,l13);
           ListNode l1=new ListNode(9,l12);
           ListNode l24=new ListNode(9);
           ListNode l23=new ListNode(9,l24);
           ListNode l22=new ListNode(9,l23);
           ListNode l2=new ListNode(9,l22);
           ListNode temp=new ListNode();
           addTwoNumbers a=new addTwoNumbers();
           System.out.printf("两数相加：\n");
           temp=a.addTwoNumbers(l1,l2);
           do
            {
               System.out.printf("%d"+",", temp.val);
              temp=temp.next;
           }while (temp!=null);
        }

    }
}