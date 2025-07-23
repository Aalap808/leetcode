class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> n1 = new HashSet<>();
        Set<Integer> n2 = new HashSet<>();

        for(int num : nums1)
        {
            n1.add(num);
        }
         for(int num : nums2)
        {
            n2.add(num);
        }

         Set<Integer> res1 = new HashSet<>();
        Set<Integer> res2 = new HashSet<>();

        for(int num : n1)
        {
            if(!n2.contains(num))
            {
                res1.add(num);
            }
        }
        for(int num : n2)
        {
            if(!n1.contains(num))
            {
                res2.add(num);
            }
        }

        return Arrays.asList(new ArrayList<>(res1), new ArrayList<>(res2));



    }
}