class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int small = Integer.MIN_VALUE;
        int longest = 1;
        if(nums.length==0)
        {
            return 0;
        }

        for(int i = 0;i<nums.length;i++)
        {
            if(nums[i]-1==small)
            {
                count++;
                small = nums[i];

            }
            else if(nums[i]!=small)
            {
                count = 1;
                small = nums[i];
            }
            longest = Math.max(longest,count);
        }
        return longest;

    }
}