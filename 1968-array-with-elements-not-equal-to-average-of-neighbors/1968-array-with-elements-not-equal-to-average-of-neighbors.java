class Solution {
    public int[] rearrangeArray(int[] nums) {
        Arrays.sort(nums);
        int l =0;
        int r = nums.length -1;
        int idx = 0;
        int[] res = new int[nums.length];
        while(idx != nums.length)
        {
            res[idx] = nums[l];
            idx++;
            l++;
            if(l<= r)
            {
                res[idx]= nums[r];
                idx++;
                r--;
            }
        }
        return res;
    }
}