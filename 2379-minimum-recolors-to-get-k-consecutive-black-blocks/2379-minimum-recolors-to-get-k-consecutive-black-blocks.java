class Solution {
    public int minimumRecolors(String blocks, int k) {
        
        int res = Integer.MAX_VALUE;

        
      

        for(int l = 0;l<=blocks.length()-k;l++)
        {int count = 0;
            for(int i = l;i<l+k;i++)
            {
                if(blocks.charAt(i) == 'W')
                {
                    count++;
                }
            }
            
            res = Math.min(count,res);
        }
        return res;
        
    }
}