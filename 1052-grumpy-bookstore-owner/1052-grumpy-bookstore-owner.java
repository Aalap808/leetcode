class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int l=0;
        int sat = 0;
        int w =0;
        int mw = 0;

        for(int r = 0;r<grumpy.length;r++)
        {
            if(grumpy[r]==1)
            {
                w += customers[r];
            }
            else{
                sat += customers[r];
            }
            if((r-l+1)>minutes)
            {
                if(grumpy[l]==1)
                {
                    w -= customers[l];
                }
                l++;
            }
            mw = Math.max(w,mw);
        }
        return sat + mw;
    }
}