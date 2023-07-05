class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        dict1 = {}
        dict2 = {}
        for i in range(len(s)):
                dict1[s[i]] = 1 + dict1.get(s[i], 0)
        for i in range(len(t)):
                dict2[t[i]] = 1 + dict2.get(t[i],0)
        if (dict1 == dict2):
            return True
        else:
            return False