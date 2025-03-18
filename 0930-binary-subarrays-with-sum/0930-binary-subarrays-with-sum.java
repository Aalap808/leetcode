class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return bi(nums,goal)-bi(nums,goal - 1);
        
    }
    public int bi(int[] nums , int goal){
        if(goal< 0){
            return 0;
        }
        int l = 0,r = 0,sum = 0,count = 0;
        while(r < nums.length){
            sum = sum+ nums[r];
            while(sum>goal){
                sum = sum - nums[l];
                l = l+1;
            }
            if(sum<= goal){
                count = count +(r-l+1);
            }
            r = r+1;
        }
        return count;


    }
}