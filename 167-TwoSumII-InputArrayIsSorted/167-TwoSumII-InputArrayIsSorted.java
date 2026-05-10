// Last updated: 10/05/2026, 14:31:10
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        int start = 0;
4        int stop = numbers.length-1;
5        while(start < stop){
6            if(numbers[start] + numbers[stop] == target){
7                return new int[]{start+1,stop+1};
8            }
9            else if(numbers[start] + numbers[stop] > target){
10                stop--;
11            }
12            else if(numbers[start] + numbers[stop] < target){
13                start++;
14            }
15        }
16        return new int[]{-1,-1};
17    }
18}