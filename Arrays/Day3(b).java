class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        // code here

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequencies
        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        // Build output for values 1 to N
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 1; i <= arr.length; i++) {
            result.add(map.getOrDefault(i, 0));
        }

        return result;
    }
}
