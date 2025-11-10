public class addTwoNumbers {
    addTwoNumbers (){}
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result=l1,last=l1;

        while(l1.next!=null&&l2.next!=null){
              result.val=(l1.val+l2.val)%10;
              result.next.val=l2.next.val+l1.next.val+(l1.val+l2.val)/10;
              /*暂时放弃了*/
         }
    return last;
    }
}
