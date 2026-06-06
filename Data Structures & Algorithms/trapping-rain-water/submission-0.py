class Solution:
    def trap(self, height: List[int]) -> int:
        #so lets go to the center 
        #mid = len(height)//2
        op = 0 
        for i in range(1,len(height)-1):
            left_max , right_max = 0 , 0
            for j in range(i-1,-1,-1):
                if(height[j] > left_max): left_max = height[j]
            for k in range(i+1,len(height)):
                if(height[k] > right_max): right_max = height[k]
            if height[i] < min(left_max , right_max):
                op += min(left_max , right_max) - height[i]
            

        return op
   # def Tall_wall(self, wall_height int ) -> int: 