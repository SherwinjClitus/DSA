// Last updated: 08/05/2026, 22:22:11
class Solution {
    public int countPairs(List<Integer> nums, int target)
    {
        int count = 0;
        for(int i=0;i<nums.size();i++)
        {
            for(int j=i+1;j<nums.size();j++)
            {
                if(nums.get(i)+nums.get(j)<target)
                {
                    count++;
                }             
            }         
        }
        return count;
    }
}