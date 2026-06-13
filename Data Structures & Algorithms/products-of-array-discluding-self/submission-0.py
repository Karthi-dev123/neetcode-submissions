class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        op=[]
        for i in range(len(nums)):
            tot = 1
            for j in range(len(nums)):
                if i == j : continue # skip maro 
                tot = tot * nums[j]
            op.append(tot)
        return op


        