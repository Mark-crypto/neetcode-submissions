class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int  left = 0;
        int  right = numbers.length - 1;

        while(right > left){
            int sum = numbers[right] + numbers[left];
            if(target == sum){
                return new int[]{left + 1,right + 1};
            }else if(sum < target){
                left++;
            }else{
                right--;
            }
            
        }

        return new int[]{-1,-1};
    }
}
