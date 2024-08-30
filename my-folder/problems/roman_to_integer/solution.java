class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanToInteger = new HashMap<>();
        romanToInteger.put('I', 1);
        romanToInteger.put('V', 5);
        romanToInteger.put('X', 10);
        romanToInteger.put('L', 50);
        romanToInteger.put('C', 100);
        romanToInteger.put('D', 500);
        romanToInteger.put('M', 1000);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((i < s.length() - 1) && (romanToInteger.get(s.charAt(i)) < romanToInteger.get(s.charAt(i + 1)))) {
                sum = sum + (romanToInteger.get(s.charAt(i + 1)) - romanToInteger.get(s.charAt(i)));
                i++;
            } else {
                sum = sum + romanToInteger.get(s.charAt(i));
            }
        }
        return sum;
    }
}