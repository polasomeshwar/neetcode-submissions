class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1;
            int k= n-1;
            while(j<k){
                List<Integer> li = new ArrayList<>();
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==0){
                    li.add(nums[i]);
                    li.add(nums[j]);
                    li.add(nums[k]);
                    res.add(li);
                    while (j < k && nums[j] == nums[j + 1]) j++;
                    while (j < k && nums[k] == nums[k - 1]) k--;
                    j++;
                    k--;
                }
                else if (sum < 0) {
                    // Sum is too small, make it bigger by moving j to the right
                    j++; 
                } 
                else {
                    // Sum is too big, make it smaller by moving k to the left
                    k--; 
                }
            } 

        }
        return res;
    }
}
