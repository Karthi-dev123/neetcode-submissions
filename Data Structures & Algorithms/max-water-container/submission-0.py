class Solution:
    def maxArea(self, heights: List[int]) -> int:
        max_vol = 0
        for i in range(len(heights)):
            #print(i ,": " ,end=" ")
            for j in range(i+1,len(heights)):
                #print(j, end= " ")

                #calc current volume 
                curr_vol = (min(heights[i],heights[j]) * (j - i))

                #compare with max and update
                if(curr_vol > max_vol):
                    max_vol = curr_vol
                    continue
        return max_vol



