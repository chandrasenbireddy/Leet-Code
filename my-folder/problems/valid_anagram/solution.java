class Solution {
    public boolean isAnagram(String s, String t) {
        boolean answer;
       if (s.length() == t.length()) {
            HashMap<Character, Integer> hmap1 = new HashMap<>();
            HashMap<Character, Integer> hmap2 = new HashMap<>();
            char[] arr1 = s.toCharArray();
            char[] arr2 = t.toCharArray();
            for (int i = 0; i < s.length(); i++) {
                if (hmap1.get(arr1[i]) == null) {
                    hmap1.put(arr1[i], 1);
                } else {
                    int count = hmap1.get(arr1[i]);
                    hmap1.put(arr1[i], ++count);
                }
            }
            for (int i = 0; i < t.length(); i++) {
                if (hmap2.get(arr2[i]) == null) {
                    hmap2.put(arr2[i], 1);
                } else {
                    int count = hmap2.get(arr2[i]);
                    hmap2.put(arr2[i], ++count);
                }
            }
            answer = hmap1.equals(hmap2);
        }
        else {
            answer = false;
        }
        return answer;
    }
}