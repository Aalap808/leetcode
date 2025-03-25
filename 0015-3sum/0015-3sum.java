class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        /* Set<List<Integer>> st = new HashSet<>(); 
         int n = nums.length;

         for(int i = 0;i<n;i++)
         {
            for(int j  = i+1;j<n;j++)
            {
                for(int k = j+1;k<n;k++)
                {
                    if(nums[i]+nums[j]+nums[k]==0)
                    {
                       List<Integer> temp =Arrays.asList(nums[i], nums[j], nums[k]);
                        temp.sort(null);
                        st.add(temp);
                    }
                }
            }
         }
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
            */
            Set<List<Integer>> st = new HashSet<>(); 
         int n = nums.length;

         for(int i = 0;i<n;i++)
         {   Set<Integer> hash = new HashSet<>();
            for(int j  = i+1;j<n;j++)
            {
                int three = -(nums[i]+nums[j]);
                if(hash.contains(three))
                {
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], three);
                    temp.sort(null);
                    st.add(temp);
                }
                hash.add(nums[j]);

            }
         }
         List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }
}