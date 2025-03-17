class Solution {
    public int subarraySum(int[] nums, int k) {
        int l=0,r=0,sum = 0,count = 0;
        if(nums.length == 0)
        {
            return k;
        }
        while(r<nums.length){
            sum = sum + nums[r];
            while(sum>k && l<= r){
                sum = sum -nums[l];
                l = l+1;
            }
            if(sum==k)
            {
                count++;
                
            }
           
            r =r +1;
        }
        return count;
    }
}