class Solution {
    public int[] asteroidCollision(int[] nums) {
        Stack<Integer> stack = new Stack<>();

        for(int a :nums )
        {
            while(!stack.isEmpty() && a<0)
            {
                int diff = a+stack.peek();
                if(diff<0)
                {
                    stack.pop();
                }
                else if(diff>0)
                {
                    a=0;
                }
                else{
                    a=0;
                    stack.pop();
                }
            }
            if(a!=0)
            {
                stack.add(a);
            }
        }
           return stack.stream().mapToInt(i -> i).toArray();
    }
}