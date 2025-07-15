class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int s = 0;
        int r = tokens.length - 1;
        int l =0;
        int res = 0;

        while(l <= r)
        {
            if(power>= tokens[l])
            {
                power = power - tokens[l];
                l++;
                s++;
                res = Math.max(res, s);

            }
            else if(s>0)
            {
                power = power + tokens[r];
                r--;
                s--;

            }
            else{
                break;
            }
        }
        return res;

        
    }
}