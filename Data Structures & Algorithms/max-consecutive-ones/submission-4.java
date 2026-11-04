class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int count = 0;
        int maxOnes = 0;

        for (int num : nums) {
            count = (num == 1) ? count + 1 : 0;
            maxOnes = Math.max(count, maxOnes);
        }
        return maxOnes;
    }
}