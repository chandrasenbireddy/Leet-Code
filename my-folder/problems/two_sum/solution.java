
class Solution {
    static int binarysrch(int[] nums,int start, int target){
        start = start+1;
        int end = nums.length - 1;
        if (nums[end] == target){
            return end;
        }

        while(start < end){
            int mid = (start + end) / 2;
            if (nums[start] == target){
                return start;
            }
            else if (nums[end] == target) {
                System.out.println(start);
                return end;
            }
            else {
                if (nums[mid] == target){
                    return mid;
                }
                else if (target > nums[mid]){
                    start = mid+1;
                }
                else{
                    end = mid;
                }
            }
        }
        return -1;
    }

    public int[] twoSum(int[] nums, int target) {
        int index;
        for(int i =0; i< nums.length; i++){
            int value = target - nums[i];
            int start = i;
            index = binarysrch(nums, start, value);
        if (index != -1){
            return new int[] {i,index}; 
        }
    }
        return null;
}
}