// Last updated: 09/05/2026, 09:35:18
1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        int cnt = 0;
4        int maxcnt = 0;
5        for(int i=0;i<nums.length;i++){
6            if(nums[i]==1){
7                cnt++;
8                maxcnt = Math.max(cnt,maxcnt);
9            }
10            else{
11                cnt = 0;
12            }
13        }
14        return maxcnt;
15    }
16}