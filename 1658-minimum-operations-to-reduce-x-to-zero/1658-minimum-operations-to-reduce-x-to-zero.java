class Solution {
    public int minOperations(int[] nums, int x) {
        int l =0;
        int sum = 0;
        int to = 0;
        for(int i = 0;i<nums.length;i++)
        {
            to += nums[i];
        }
        int target = to - x;
        int win =-1;

        for(int r = 0;r<nums.length;r++)
        {
            sum +=nums[r];

            while(sum> target)
            {
                sum -=nums[l];
                l++;
            }
            if(sum == target)
            {
               win = Math.max(win , r-l+1);

            }
            
        }
        if(win == -1)
        {
            return -1;      

        }
        else{
            return nums.length-win;
        }
        
    }
}