class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);

        backtrack(0, target, candidates, new ArrayList<>(), result);

        return result;
    }

    private void backtrack(int start, int target, int[] candidates,
                           List<Integer> combination,
                           List<List<Integer>> result) {

        if (target == 0) {
            result.add(new ArrayList<>(combination));
            return;
        }

        if (target < 0) {
            return;
        }

        for (int i = start; i < candidates.length; i++) {

            // Skip duplicates
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }

            // Since the array is sorted, no need to continue
            if (candidates[i] > target) {
                break;
            }

            combination.add(candidates[i]);

            // i + 1 because each number can only be used once
            backtrack(i + 1, target - candidates[i], candidates,
                      combination, result);

            combination.remove(combination.size() - 1);
        }
    }
}