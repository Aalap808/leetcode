class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // int res = Integer.MAX_VALUE;
        // for(int i =0;i<nums.length;i++)
        // {
        //     int sum = 0;
        //     for(int j = i;j<nums.length;j++)
        //     {
        //         sum +=nums[j];
        //         if(sum>=target)
        //         {
        //             res = Math.min(res,j-i+1);
        //             break;
        //         }
        //     }
            
        // }
        // if(res == Integer.MAX_VALUE)
        // {
        //     return 0;
        // }
        // else{
        //     return res;
        // }

        int l =0;
        int total = 0;
        int res = Integer.MAX_VALUE;
        for(int r = 0;r<nums.length;r++)
        {
            total += nums[r];
            while(total>= target)
            {

                res = Math.min(res,r-l+1);
                total -= nums[l];
                l++;
            }
        }
        if(res == Integer.MAX_VALUE)
        {
            return 0;
        }
        else{
            return res;
        }

        
    }
}