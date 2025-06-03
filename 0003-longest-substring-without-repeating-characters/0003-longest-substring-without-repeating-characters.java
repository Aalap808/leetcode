class Solution {
    public int lengthOfLongestSubstring(String s) {
        // int res = 0;
        

        // for(int i =0;i<s.length();i++)
        // {Set<Character> n= new HashSet<>();
        //     for(int j= i;j<s.length();j++)
        //     {
        //         if(n.contains(s.charAt(j)))
        //         {
        //             break;
        //         }
        //         n.add(s.charAt(j));
        //     }
        //     res = Math.max(res,n.size());
        // }
        // return res;
        int res = 0;
        Set<Character> n= new HashSet<>();
        int l = 0;

        for(int r = 0;r<s.length();r++)
        {
            while(n.contains(s.charAt(r)))
            {
                n.remove(s.charAt(l));
                l++;
            }
            n.add(s.charAt(r));
            res = Math.max(res, r-l+1);
        }
        return res;


        
    }
}