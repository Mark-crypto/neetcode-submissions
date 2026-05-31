class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] results = new int [nums.length];

        results[0] = 1;
        //prefix
        for(int  i = 1; i < nums.length; i++){
            results[i] = results[i - 1] * nums[i - 1]; 
        }

        //suffix
        
        int suffix = 1;
        for(int i = nums.length - 1; i >= 0; i--){
            results[i] *= suffix;
            suffix *= nums[i]; 
        }

        return results;
    }
}  
