class Solution:

    def encode(self, strs: List[str]) -> str:
        encoded_str=""
        for word in strs:
            encoded_str += str(len(word)) + '#' + word 
        print(encoded_str)
        return encoded_str


    def decode(self, s: str) -> List[str]:
        i = 0 
        op = []
        while i < len(s):
            j = i 

            #keep moving till we find # 
            while s[j] != '#':
                j += 1

            word_length = int(s[i:j:1])

            word = s[j+1 : j+1+word_length]

            op.append(word)

            i = j + 1 + word_length

        return op

