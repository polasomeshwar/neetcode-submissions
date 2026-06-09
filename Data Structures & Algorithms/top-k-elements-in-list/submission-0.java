class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        System.out.println(map.toString());

        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b)->(b.getValue()-a.getValue()));

        pq.addAll(map.entrySet());
        System.out.println(pq.toString());
        int result[] = new int[k];
        for(int i=0;i<k;i++){
            result[i] = pq.poll().getKey();
        }
        return result;
    }
}
