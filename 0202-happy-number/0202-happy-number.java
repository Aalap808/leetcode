class Solution {
    public boolean isHappy(int n) {
       Set<Integer> used = new HashSet<>();

       while(true)
       {

        int sum = 0;
        while(n!=0)
        {
            int d = n % 10;
            sum = sum+ d*d;
            n = n/10;
        }
        n = sum;
       

        if(n == 1)
        {
            return true;
        }

        if(used.contains(n))
        {
             return false;
        }
         used.add(n);





       }
        
        
    }
}