/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {
    let count = 1, element = nums[0]; 
    for(let i = 1; i < nums.length; i++) {
        if (element == nums[i]) {
            count++;
        }
        else if (element != nums[i] && count > 0) {
            count--;
        }
        else if (count == 0) {
            element = nums[i];
        }
    }
    return element;
};