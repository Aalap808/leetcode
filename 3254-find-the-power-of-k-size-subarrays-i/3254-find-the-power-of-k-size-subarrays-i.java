class Solution {
    public int[] resultsArray(int[] nums, int k) {

        int l =0;
        int count = 1;
        List<Integer> a = new ArrayList<>();
     if (k == 1) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[i];
        }
        return res;
    }
       

        for(int r =1;r<nums.length;r++)
        {
            if(nums[r -1]+1 == nums[r]){
                count++;
            }
            
            if(r-l+1>k)
            {   
              if(nums[l]+1 == nums[l+1]){
               count--;
              }
             l++;
            }
            if(r-l+1==k)
            {   if(count ==k){
                a.add(nums[r]);
            }
            else{
                a.add(-1);
            }
            }

        }
        int[] res = new int[a.size()];
        for(int i =0;i<a.size();i++ )
        {
            res[i] = a.get(i);
        }
        return res;
        
    }
}