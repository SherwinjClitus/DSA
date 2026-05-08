// Last updated: 08/05/2026, 22:22:19
class Solution {
    public boolean findSubarrays(int[] nums)
    {
        HashSet<Integer> A = new HashSet<>();
        for (int i=0;i<nums.length-1;i++)
        {
            int sum = nums[i]+nums[i+1];
            if(A.contains(sum))
            {
                return true;
            }
            A.add(sum);
       }
       return false;
         
    }
}