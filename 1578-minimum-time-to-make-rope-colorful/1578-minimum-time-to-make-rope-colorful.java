class Solution {
    public int minCost(String colors, int[] neededTime) {
        int time = 0;
        int l =0;
        for(int r = 1;r<colors.length();r++)
        {
            if(colors.charAt(r)== colors.charAt(l))
            {
                if(neededTime[l]<neededTime[r])
                {
                    time += neededTime[l];
                    l=r;
                }
                else{
                    time += neededTime[r];
                }
            }
            else{
                l =r;
            }
        }
        return time;
        
    }
}