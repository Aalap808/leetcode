class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray())
        {
            if(c == '*')
            {
              if(!stack.isEmpty())
              {
                stack.pop();
              }
            }
            else{
                stack.push(c);
            }

        }
         StringBuilder res = new StringBuilder();
         for(char a: stack)
         {
            res.append(a);
         }
         return res.toString();
    }
}