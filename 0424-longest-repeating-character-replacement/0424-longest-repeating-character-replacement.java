class Solution {
    public int characterReplacement(String s, int k) {
        int res = 0;
        Set<Character> n = new HashSet<>();

        for(char c : s.toCharArray())
        {
            n.add(c);
        }

        for(char c : n)
        {
            int count = 0;
            int l =0;
            for(int r = 0;r<s.length();r++)
            {
                if(s.charAt(r)==c)
                {
                    count++;
                }
                while((r-l+1)-count>k)
                {
                    if(s.charAt(l)==c)
                {
                    count--;
                }
                l++;
                }
                res = Math.max(res,r-l+1);
            }
            
        }
        return res;
        
    }
}