class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num,0) + 1);
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>(
            (a,b)-> map.get(a) - map.get(b)
        );

        for(int num : map.keySet()){
            heap.offer(num);

            if(heap.size() > k){
                heap.poll();
            }
        }

        int[] results = new int[k];

        for(int i = k- 1; i >= 0; i--){
            results[i] = heap.poll();
        }
        return results;
    }
}
