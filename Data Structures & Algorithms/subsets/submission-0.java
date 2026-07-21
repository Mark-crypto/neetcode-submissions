class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int index, int[] nums, List<Integer> subset,
                           List<List<Integer>> result) {

        if (index == nums.length) {
            result.add(new ArrayList<>(subset));
            return;
        }

        // Include nums[index]
        subset.add(nums[index]);
        backtrack(index + 1, nums, subset, result);

        // Exclude nums[index]
        subset.remove(subset.size() - 1);
        backtrack(index + 1, nums, subset, result);
    }
}