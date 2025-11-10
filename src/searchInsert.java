public class searchInsert {
    public searchInsert(){}
    public int searchInsert(int[] nums, int target) {
        int temp=nums.length-1;
      for(int i=0;i<nums.length;i++){
          if(nums[i]>=target) {
              return i;
          }
          else{
             temp=i+1;
          }

      }
      return temp;
    }
}
