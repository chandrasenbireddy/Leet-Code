class Solution {
    public int lengthOfLongestSubstring(String s) {
        String finalSubString = "", subString = "";
        if (s.length() == 0) { return 0;}
        int currentStart = 0, z = 0;
        subString = s.substring(0, 1);
        for (int i = 1; i < s.length(); i++) {
            // iterate through all the char's
            if (z == 0) {
                z++;
                currentStart++;
            }
            if (subString.indexOf(s.charAt(i)) == -1) {
                subString = subString + s.charAt(i);
            } else {
                z = 0;
                i = currentStart;
                if (finalSubString.length() < subString.length()) {
                    finalSubString = subString;
                    subString = s.substring(currentStart, currentStart + 1);
                } else {
                    subString = s.substring(currentStart, currentStart + 1);
                }
            }
        }
        if (subString.length() > finalSubString.length()) {
            finalSubString = subString;
        }
        return finalSubString.length();
    }
}