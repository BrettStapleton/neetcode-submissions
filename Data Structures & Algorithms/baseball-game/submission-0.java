class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> result = new ArrayList<>();
        int sum = 0;

        for (int i=0; i<operations.length; i++) {
            if (operations[i].equals("+")) {
                result.add(result.get(result.size() - 1) + result.get(result.size() - 2));
            }
            else if (operations[i].equals("C")) {
                result.remove(result.size() - 1);
            }
            else if (operations[i].equals("D")) {
                result.add(result.get(result.size() - 1) * 2);
            }
            else {
                result.add(Integer.valueOf(operations[i]));
            }
        }

        for (int record : result) {
            sum += record;
        }
        return sum;
    }
}