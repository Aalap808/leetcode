class Solution {
    public String makeGood(String s) {
               Stack<Character> stack = new Stack<>();

               for(char c : s.toCharArray())
               {
                if(!stack.isEmpty() && stack.peek() != c && Character.toLowerCase(stack.peek()) == Character.toLowerCase(c))
                {
                    stack.pop();
                }
                else{
                    stack.push(c);
                }
               }
               StringBuilder a = new StringBuilder();
               for(char c : stack)
               {
                a.append(c);
               }
               return a.toString();
    }
}