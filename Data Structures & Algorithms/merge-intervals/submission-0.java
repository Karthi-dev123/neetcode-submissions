class Solution {
    public int[][] merge(int[][] intervals) {
        // brute force gives O(n^2) , so lets try first sorting to make it logn 
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));


        // lets write a for loop and traverse through this 
        // b4 that declare a empty ll 
        LinkedList<int[]> op = new LinkedList<>();
        for(int i = 0 ; i < intervals.length ; i++){
            
            // we write if conditions 
            // condition : 1 if ll is empty simply add 
            if(op.isEmpty()) op.add(intervals[i]);
            else if(op.getLast()[1] >= intervals[i][0]) op.getLast()[1] = Math.max(op.getLast()[1] ,intervals[i][1] );
            else op.add(intervals[i]);

        }

        // now we can simply conver this to array and return it 
        return op.toArray(new int[op.size()][]);
    }
}
