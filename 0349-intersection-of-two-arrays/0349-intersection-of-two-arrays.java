class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s = new HashSet<>();

        for(int i : nums1)
        {
            for(int j : nums2)
            {
                if(i == j)
                {
                    s.add(i);
                    break;
                }
            }
        }

       
        int[] res = new int[s.size()];
         int i = 0;
        for(int j : s)
        {
            res[i]= j;
            i++;
        }
        return res;

        
    }
}