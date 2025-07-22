class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer,Integer> s = new HashMap<>();
        for(int num : nums)
        {
            s.put(num,s.getOrDefault(num,0)+1);
        }
        for(int c : s.values())
        {
            if(c %2 == 0)
            {
                return true;
            }
        }
        return false;
        
    }
}