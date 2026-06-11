class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:

        # lets form a dict frist : 
        freq_dict = {}

        for i in nums:
            if freq_dict.get(i): freq_dict[i] += 1;
            else: freq_dict[i] = 1;

        # lets make a list and add it there ( but make it negative coz python heap usees min heap)
        heap = []

        # now lets unpack it 
        for num , count in freq_dict.items():
            heap.append((-count, num));

        # now lets heapify ts
        heapq.heapify(heap)
        op = []

        for _ in range(k):
            freq , num = heapq.heappop(heap)
            op.append(num)

        return op



        