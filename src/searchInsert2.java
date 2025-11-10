public class searchInsert2 {
    public searchInsert2(){}
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int left=0,right=n-1,temp=n;
        while(left<=right){
            int mid=((right-left)>>1)+left;
            if(target<=nums[mid]){
                right=mid-1;temp=mid;
            }
            else left=mid+1;
        }
        return temp;
    }
}
