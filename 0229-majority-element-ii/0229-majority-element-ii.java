class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
       List<Integer> m = new ArrayList<>();

       for(int i= 0;i< nums.length;i++)
       {int count = 0;
        if(m.size()==0 || !m.contains(nums[i]))
        {
        for(int j = 0 ;j< nums.length;j++)
        {
            if(nums[j]== nums[i])
            {
                count++;
            }

        }}
        if(count > ((nums.length)/3)){
            m.add(nums[i]);
        }
       }
       return m;
        
    }
}