class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] newArray = Arrays.copyOf(nums, nums.length * 2);
        for (int i=nums.length; i<newArray.length; i++) {
            newArray[i] = newArray[i-nums.length];
        }
        return newArray;
    }
}