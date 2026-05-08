// Last updated: 08/05/2026, 22:22:10
class Solution {
    public boolean checkDivisibility(int n) {
        int og = n;
        int num = n;
        int sum1 =0;
        int sum2 = 1;
        while(n>0){
            int rem=n%10;
            sum1 += rem;
            n = n/10;
        }
        while(num>0){
            int rem = num%10;
            sum2 *= rem;
            num = num/10;
        }
        return(og%(sum1+sum2)==0); 
    }
}