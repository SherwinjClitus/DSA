// Last updated: 10/05/2026, 19:01:25
1class Solution {
2    public int maxArea(int[] height) {
3        int start = 0;
4        int stop = height.length-1;
5        int maxarea = 0;
6        // int width = stop - start;
7        // int currentheight = Math.min(height[start],height[stop]);
8        while(start < stop){
9            int width = stop - start;
10            int currentheight = Math.min(height[start],height[stop]);
11            int currentarea = width * currentheight;
12            maxarea = Math.max(maxarea,currentarea);
13            if(height[start] < height[stop]){
14                start++;
15            }
16            else{
17                stop--;
18            }
19        }
20        return maxarea;
21    }
22}