class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);
        int max_length = 1;
        int current_length = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                // skip duplicates
                continue;
            } else if (nums[i] == nums[i - 1] + 1) {
                current_length++;
            } else {
                current_length = 1;
            }
            max_length = Math.max(max_length, current_length);
        }

        return max_length;
    }
}
