class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();

        for(char c : num.toCharArray())
        {
            while(k>0 && !stack.isEmpty() && stack.peek()> c)
            {
                stack.pop();
                k--;
            }


            stack.push(c);

        }
        while(k> 0 && !stack.isEmpty())
        {
            stack.pop();
            k--;
        }
        StringBuilder res = new StringBuilder();
        for(char a : stack)
        {
            res.append(a);
        }
     

        int i =0;
        while(i<res.length() && res.charAt(i)=='0')
        {
            i++;
        }

        String nres = res.substring(i);
       if (nres.isEmpty())
        {
            return "0";
        } 
        else 
        {
          return nres;
         }

    }
}