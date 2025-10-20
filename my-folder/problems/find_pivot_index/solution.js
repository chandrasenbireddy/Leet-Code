/**
 * @param {number[]} nums
 * @return {number}
 */
var pivotIndex = function(nums) {
    let total =0, leftSum = 0;
    for(let num of nums) {
        total+=num;
    }
    for(let i =0; i < nums.length; i++){
        if(leftSum == total - nums[i] - leftSum){
            return i;
        }
        leftSum += nums[i];
    }
    return -1;
};