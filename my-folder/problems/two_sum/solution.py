class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        prevMap = {} # to store value and index of elapsed array
        for i , n in  enumerate(nums):
            diff = target - n
            if diff in prevMap:
                return [prevMap[diff], i]
            prevMap[n] = i

        