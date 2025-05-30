class Solution {
    public int maxArea(int[] height) {
        int res = 0;
        int l =0;
      for(l = 0;l<height.length;l++)
      {
        for(int r = l+1;r<height.length;r++)
        {
            int area = (r-l) * Math.min(height[l],height[r]);
            res = Math.max(area , res);
        }
      }   
      return res;     
    }
}