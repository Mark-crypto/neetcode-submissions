class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {

        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, target, nums, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int index, int target, int[] nums,
                           List<Integer> combination,
                           List<List<Integer>> result) {

        if (target == 0) {
            result.add(new ArrayList<>(combination));
            return;
        }

        if (index == nums.length || target < 0) {
            return;
        }

        // Include nums[index] (can reuse it)
        combination.add(nums[index]);
        backtrack(index, target - nums[index], nums, combination, result);

        // Exclude nums[index]
        combination.remove(combination.size() - 1);
        backtrack(index + 1, target, nums, combination, result);
    }
}