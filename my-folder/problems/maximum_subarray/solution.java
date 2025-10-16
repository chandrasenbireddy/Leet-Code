class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int finalSum = sum;
        for(int i=1; i < nums.length; i++) {
            if (sum + nums[i] < nums[i]) {
                sum = nums[i];
                if(sum > finalSum) {
                    finalSum = sum;
            }
                continue;
            }
            if(sum > finalSum) {
                    finalSum = sum;
            }
            if((sum + nums[i]) < 0){
                sum = nums[i];
                continue;
            }
            sum += nums[i];
        }
        if(sum > finalSum) {
                    finalSum = sum;
            }
        return finalSum;
    }
}