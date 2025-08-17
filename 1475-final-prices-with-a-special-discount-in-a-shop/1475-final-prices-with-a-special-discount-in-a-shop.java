class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] res = new int[n];

        for(int i = 0;i <n;i++)
        {
            res[i] = prices[i];
        }
        Stack<Integer> s = new Stack<>();

        for(int i = 0;i<n;i++)
        {
           while(!s.isEmpty() && prices[s.peek()]>= prices[i])
           {
            int j = s.pop();
            res[j] = res[j] - prices[i];
           }


            s.push(i);
        }
        return res;
        
    }
}