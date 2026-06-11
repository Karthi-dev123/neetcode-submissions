import math

class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        maxm = max(piles)

        left = 1 
        right = maxm 

        while left <= right :

            mid = left + (right - left)//2 

            # now check if mid k value works 
            tot_hrs = 0 
            for i in piles:
                tot_hrs += math.ceil(i/mid)
            if(tot_hrs <= h):
                # everything after mid would work , so remove those 
                # we have to look at the left side of mid 
                right = mid-1

            else:
                left = mid + 1 

        return left