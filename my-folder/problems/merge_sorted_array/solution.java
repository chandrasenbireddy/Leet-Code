class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = new int[m];
        for (int i = 0; i < m; i++) {
            nums3[i] = nums1[i]; //Copying array into another array to use this one 
        }
        int a = 0 , b = 0;
        //iterating through m+n elements and caliculating appropriate value int the corresponding index
        for (int i = 0, l = m + n; i < l; i++) {
            // checking if any array has  reached end 
            if (a < m && b < n){
                //considering one index at a time
                if (nums3[a] > nums2[b]) {
                    nums1[i] = nums2[b];
                    b++;
                }
                else if (nums3[a] < nums2[b]) {
                    nums1[i] = nums3[a]; 
                    a++;             
                }
                else if (nums3[a] == nums2[b]) {
                    nums1[i] = nums3[a];
                    a++;
                }
            }
            else if (a < m){
                nums1[i] = nums3[a]; 
                a++;
            }
            else if (b < n){
                nums1[i] = nums2[b]; 
                b++;
            }
            
        }        
    }
}