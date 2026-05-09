// Last updated: 09/05/2026, 09:33:05
1class Solution {
2    public int[] getConcatenation(int[] nums) {
3        int index = 0;
4        int[] arr = new int[nums.length * 2];
5        for(int num : nums){
6            arr[index] = num;
7            index++;
8        }
9        for(int num : nums){
10            arr[index] = num;
11            index++;
12        }
13        return arr;
14    }
15}