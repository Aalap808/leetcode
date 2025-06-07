class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // int n = temperatures.length;
        // int[] res = new int[n];

        // for(int i =0 ;i<n;i++)
        // {
        //     int count = 1;
        //     int j;
        //     for(j = i+1;j<n;j++)
        //     {
        //         if(temperatures[i]<temperatures[j])
        //         {
        //             break;
        //         }
        //         count++;

        //     }
        //     if(j==n){
        //         count = 0;
        //     }
        //     res[i]= count;
        // }
        // return res;
      int[] res = new int[temperatures.length];
      Stack<int[]> stack = new Stack<>();

      for(int i = 0;i< temperatures.length;i++)
      {
        int t = temperatures[i];
        while(!stack.isEmpty() && t> stack.peek()[0])
        {
            int[] pair = stack.pop();
            res[pair[1]]= i-pair[1];
        }
        stack.push(new int[] {t,i});
      }
        return res;
    }
}