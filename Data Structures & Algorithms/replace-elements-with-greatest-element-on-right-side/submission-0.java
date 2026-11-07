class Solution {
    public int[] replaceElements(int[] arr) {
        int[] result = new int[arr.length];
        int endpoint = -1;
        for (int i=arr.length-1; i>=0; i--) {
            result[i] = endpoint;
            endpoint = Math.max(endpoint, arr[i]);
        }
        return result;
    }
}