/**
 * @param {number[]} nums
 * @return {number}
 */
var missingNumber = function(nums) {
    let total = nums.reduce((acc,num)=>acc+num, 0);
    return (nums.length*(nums.length +1)/2) - total;
};