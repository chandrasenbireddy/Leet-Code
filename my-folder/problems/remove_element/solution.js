/**
 * @param {number[]} nums
 * @param {number} val
 * @return {number}
 */
var removeElement = function(nums, val) {
    let k = 0, j=0;
    for(let i =0; i < nums.length; i++){
        if (nums[i] != val){
            nums[j] = nums[i];
            j++;
        }
    }
    return j;
};