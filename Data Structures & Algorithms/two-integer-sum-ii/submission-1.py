class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        # obviously its the 2 pointer approach , im redoing ts in python 
        left = 0 
        right = len(numbers) - 1 

        while left < right:
            sum = numbers[left] + numbers[right]

            if sum == target:
                return [left+1 , right+1]
            elif sum < target:
                left += 1
            else:
                right -= 1
        return []