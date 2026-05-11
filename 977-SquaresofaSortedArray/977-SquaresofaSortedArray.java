// Last updated: 11/05/2026, 21:02:59
1class Solution {
2    public int[] sortedSquares(int[] nums) {
3        int start = 0;
4        int stop = nums.length-1;
5        int index = nums.length-1;
6        int[] result = new int[nums.length];
7        while(start <= stop){
8            
9            int leftsquare = nums[start] * nums[start];
10            int rightsquare = nums[stop] * nums[stop];
11
12            if(leftsquare > rightsquare){
13                result[index] = leftsquare;
14                start++;
15            }
16            else{
17                result[index] = rightsquare;
18                stop--;
19            }
20            index--;
21        }
22        return result;
23    }
24}