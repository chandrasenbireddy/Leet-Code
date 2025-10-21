class Solution {
    public int majorityElement(int[] nums) {
        int count = 1, element= nums[0];
        for(int i=1; i < nums.length; i++) {
            if(nums[i] == element){
                count++;
            }
            else if(nums[i] != element && count > 0){
                count--;
            }
            else if(count == 0){
                element = nums[i];
            }
        }
        return element;
    }
}