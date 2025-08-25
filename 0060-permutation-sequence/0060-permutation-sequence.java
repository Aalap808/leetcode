class Solution {
    
    public String getPermutation(int n, int k) {
        k--; 
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++)
            nums.add(i + 1);
        StringBuilder ans = new StringBuilder();

        int[] factorial = new int[n];
        factorial[0] = 1;
        for (int i = 1; i < n; i++)
            factorial[i] = factorial[i - 1] * i;

        for (int cnt = 1; cnt < n; cnt++) {
            int pattern = factorial[n - cnt];
            int ind = k / pattern;
            k -= pattern * ind;

            ans.append(nums.get(ind).toString());
            nums.remove(ind);

            
        }
        ans.append(nums.get(0).toString());

        return ans.toString();
    }
}

