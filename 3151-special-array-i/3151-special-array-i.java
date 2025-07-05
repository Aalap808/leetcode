class Solution {
    public boolean isArraySpecial(int[] nums) {
        for(int i = 1;i<nums.length;i++)
        {
            if(parity(nums[i]).equals(parity(nums[i - 1])))
            {
                return false;
            }
        }
        return true;
        
    }
    public String parity(int n)
    {
        if(n% 2 ==0)
        {
            return "odd";
        }
        else 
        {return "even";
        }
    }
}