class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i = 0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                  nums[i] *= 2;
                  nums[i+1]= 0;
            }
        }
        List<Integer> l = new ArrayList<>();
        int zc= 0;

        for(int num : nums)
        {
            if(num != 0)
            {
                l.add(num);
            }
            else{
                zc++;
            }
        }
        for(int i = 0;i<zc;i++)
        {
            l.add(0);
        }

        int[] res = new int[nums.length];
        for(int i =0;i<nums.length;i++)
        {
            res[i]= l.get(i);
        }
        return res;
    }
}