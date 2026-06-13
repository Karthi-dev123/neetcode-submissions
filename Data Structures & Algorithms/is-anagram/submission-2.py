class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t) : 
            return False
        op = {}
        for i in s:
            if(i in op.keys()):
                op[i] += 1
            else:
                op[i] = 1
        for j in t:
            if(j in op.keys()):
                op[j] -= 1
                if op[j] < 0 : return False
            else:
                return False
        return True
        