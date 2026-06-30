class KthLargest {
    int k ;
    // declare a min heap 
    PriorityQueue<Integer> minheap = new PriorityQueue<>();

    public KthLargest(int k, int[] nums) {
        this.k = k ; 
        Arrays.sort(nums); // only put k elementts in min heap 
        for(int i = nums.length -1 ; i >=  nums.length - k && i >= 0  ; i--){
            minheap.offer(nums[i]);
        }
        // for(int i = 0 ; i < nums.length ; i++){
        //     minheap.offer(nums[i]);
        // }

        // //         while(minheap.size() > k ){
        // //     minheap.poll();
        // // }
        // fixit();


    }
    
    public int add(int val) {
        // just add the val into minheap 
        minheap.offer(val);

        while(minheap.size() > k ){
            minheap.poll();
        }
        // fixit();

        return minheap.peek();
    }

    // public void fixit(){
    //             while(minheap.size() > k ){
    //         minheap.poll();
    //     }
    // }
}
