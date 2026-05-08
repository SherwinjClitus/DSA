// Last updated: 08/05/2026, 22:22:25
class Solution {
    public int[] getConcatenation(int[] nums) {
        int index = 0;
        int[] arr = new int[nums.length * 2];
        for(int num : nums){
            arr[index] = num;
            index++;
        }
        for(int num : nums){
            arr[index] = num;
            index++;
        }
        return arr;
    }
}