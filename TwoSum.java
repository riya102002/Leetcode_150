class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> nummap = new HashMap<>(); 
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i]; // 
            if (nummap.containsKey(diff)) {
                return new int[]{nummap.get(diff), i}; 
            }
            nummap.put(nums[i], i); 
        }
        return new int[]{}; 
    }
}
