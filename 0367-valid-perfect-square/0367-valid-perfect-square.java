class Solution {
    public boolean isPerfectSquare(int num) {
        // for(int i =1;i<= num;i++)
        // {
        //     long sq = i*i;
        //     if(sq > num)
        //     {
        //         return false;
        //     }
        //     if(sq == num){
        //         return true;
        //     }
        // }
        // return false;
        long l =1;
        long r = num;

        while(l<= r)
        {
            long m = l+(r-l) /2;
            long sq = m*m;

            if(sq>num)
            {
                r = m-1;
            }
            else if(sq<num)
            {
                l = m+1;

            }
            else{
                return true;
            }
        }
        return false;
    }
}