class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
        }

        List<Integer>[] bucket = new List[nums.length + 1];

        for(int key : map.keySet()){
            int freq = map.get(key);

            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }
        //[[2,3],[4,5,6]] -> freq are keys and elements are numbers in nums that have that freq

        int[] results = new int[k];
        int idx = 0;

        for(int i = bucket.length - 1; i >= 0; i--){
            if(bucket[i] != null){
                for(int digit : bucket[i]){
                    results[idx++] = digit;
                    if(idx == k){
                        return results;
                    }
                } 
            }
        }

        return results;
    }
}
