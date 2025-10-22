class Solution {
    public void rotate(int[] nums, int k) {

        k = k%nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0,k-1);
        reverse(nums, k, nums.length-1);
        System.gc();
    }

    public void reverse(int[] nums, int left, int right)
    {int temp;
        while(left<right)
        {
            temp=nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}