class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int count = 0;
        int maxOnes = 0;

        for (int i=0; i<nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else if (count > maxOnes) {
                maxOnes = count;
                count = 0;
            } else {
                count = 0;
            }
        }
        if (count > maxOnes) {
            maxOnes = count;
        }
        return maxOnes;
    }
}