class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       Set<Integer> n1 = new HashSet<>();
        for(int num: nums1) {
            n1.add(num);
        }
        Set<Integer> n2 = new HashSet<>();
        for(int num: nums2){
            if(n1.contains(num) && !n2.contains(num)){
                n2.add(num);
            }
        }
        int[] answer = new int[n2.size()];
        int i =0;
        for(int num: n2){
            answer[i++] = num;
        }
        return answer;
    }
}