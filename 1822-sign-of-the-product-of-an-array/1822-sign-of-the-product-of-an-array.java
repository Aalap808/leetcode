class Solution {
    public int arraySign(int[] nums) {
        // long pro = 1;
        // for(int i = 0;i<nums.length;i++)
        // {
        //     pro = pro * nums[i];
        // }
        // if(pro > 0)
        // {
        //     return 1;
        // }
        // else if(pro < 0)
        // {
        //     return -1;
        // }
        // else{
        //     return 0;
        // }

        int sign =1;
        for(int num: nums)
        {
            if(num == 0)
            {
                return 0;
            }
            if(num<0)
            {
                sign = sign * -1;

            }
        }
        return sign;
    }
}