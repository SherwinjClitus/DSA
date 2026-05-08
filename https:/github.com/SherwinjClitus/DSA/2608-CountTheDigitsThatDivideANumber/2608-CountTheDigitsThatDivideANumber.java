// Last updated: 08/05/2026, 22:22:13
class Solution {
    public int countDigits(int num)
    {
        int count = 0;
        int temp = num;
        while (temp>0)
        {
            int ld = temp%10;
            if(ld !=0 && num%ld==0) count++;
            temp = temp/10;
        }
        return count;
    }
}