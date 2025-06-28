class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> less = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();

        for(int n : nums)
        {
            if(n>pivot)
            {
                greater.add(n);
            }
            else if(n<pivot)
            {
                less.add(n);
            }
            else{
                equal.add(n);
            }
        }

        int[] res = new int[nums.length];

        int inx = 0;

        for(int n : less)
        {
            res[inx++] = n;
        }
         for(int n : equal)
        {
            res[inx++] = n;
        }
         for(int n : greater)
        {
            res[inx++] = n;
        }
      return res;

        
    }
}