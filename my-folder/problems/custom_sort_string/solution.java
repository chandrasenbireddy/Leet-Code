class Solution {
    public String customSortString(String order, String s) {
        
        // Step 1: Create a frequency map for characters in 's'
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Step 2: Build the result string based on the order in 'order'
        StringBuilder result = new StringBuilder();
        for (char c : order.toCharArray()) {
            if (frequencyMap.containsKey(c)) {
                // Append the character 'c' frequencyMap.get(c) times
                int count = frequencyMap.get(c);
                for (int i = 0; i < count; i++) {
                    result.append(c);
                }
                // Remove the character from the map after processing
                frequencyMap.remove(c);
            }
        }

        // Step 3: Append the remaining characters from 's'
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();
            for (int i = 0; i < count; i++) {
                result.append(c);
            }
        }

        return result.toString();
    }
}