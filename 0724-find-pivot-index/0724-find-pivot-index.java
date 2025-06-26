class Solution {
    public int pivotIndex(int[] nums) {

        int n = nums.length;

        for(int i = 0;i< n;i++)
        {
            int ls= 0;
            int rs = 0;
            for(int l = 0;l<i;l++)
            {
                ls += nums[l];
            }
            for(int r = i+1;r<n;r++)
            {
                rs += nums[r];
            }
            if(ls == rs)
            {
                return i;
            }
        }
        return -1;
        
    }
}