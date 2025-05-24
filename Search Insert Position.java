class Solution { 
    public int searchInsert(int[] nums, int target) {
        int count = 0;
        int k = nums.length - 1;
        while (count <= k) {
            int mid = (count + k) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                count = mid + 1;
            } else {
                k = mid - 1;
            }
        }
        return count;
    }
}
