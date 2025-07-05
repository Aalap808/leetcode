class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer> count = new HashMap<>();
        int l = 0;
        int res = 0;
        int total = 0;

        for(int r = 0;r<fruits.length;r++)
        {   int f = fruits[r];
            count.put(f,count.getOrDefault(f,0)+1);
            total++;

            while(count.size()>2)
            {   int m = fruits[l];
                count.put(m,count.getOrDefault(m,0)-1);
                total--;
                if(count.get(m)==0)
                {
                    count.remove(m);
                }
                l++;

            }
            res = Math.max(res,total);
        }
        return res;
        
    }
}