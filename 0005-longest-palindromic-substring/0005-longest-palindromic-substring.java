class Solution {
    public String longestPalindrome(String s) {
        int resi = 0;
        int reslen = 0;

        for(int i =0;i<s.length();i++)
        {
            int l = i;
            int r =i;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r))
            {
                if(r-l+1>reslen)
                {
                    resi = l;
                    reslen = r-l+1;
                }
                l--;
                r++;
            }
             l =i;
             r = i+1;
              while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r))
            {
                if(r-l+1>reslen)
                {
                    resi = l;
                    reslen = r-l+1;
                }
                l--;
                r++;
            }
        }
        return s.substring(resi,reslen+resi);
        
    }
}