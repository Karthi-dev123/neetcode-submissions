class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
    //[2.82 , 1] [2 ,0.0]
    //points[0]

    PriorityQueue<float[]> maxheap = new PriorityQueue<>((a,b) -> Float.compare(b[0] , a[0]));

    for(int i = 0 ; i < points.length ; i++){
        int x1 = points[i][0];
        int y1 = points[i][1];
        // compute dist 
        float dist = (float) Math.sqrt((x1 * x1) + (y1 * y1));
        // put [dist , index] --> max heap 
        maxheap.add(new float[] { dist , (float) i });
    }

    while(maxheap.size() > k){
        maxheap.poll();
    }

    int[][] result = new int[k][2];
    for(int i = 0 ; i < k ; i++){
        result[i] = points[ (int) maxheap.poll()[1] ];
    }

    return result;



    

    }
}
