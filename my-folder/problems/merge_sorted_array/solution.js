/**
 * @param {number[]} nums1
 * @param {number} m
 * @param {number[]} nums2
 * @param {number} n
 * @return {void} Do not return anything, modify nums1 in-place instead.
 */
var merge = function(nums1, m, nums2, n) {
    let nums3 = [...nums1];
    let a =0, b=0;
    for ( let i =0 ; i < m+n; i++) {
        if(a<m && b< n){
            if(nums3[a] < nums2[b]){
                nums1[i] = nums3[a];
                a++; 
            }
            else if (nums3[a] > nums2[b]){
                nums1[i] = nums2[b];
                b++; 
            }
            else if (nums3[a] == nums2[b]) {
                nums1[i] = nums2[b];
                b++;
            }
        }
        else if (a< m) {
            nums1[i] = nums3[a];
            a++;
        }
        else if (b<n){
            nums1[i] = nums2[b];
            b++
        }
    }
};