class Solution {
    public int longestConsecutive(int[] nums) {
        // address edge cases 
        if(nums.length == 0) return 0;
        if(nums.length == 1) return 1;

        Arrays.sort(nums);
        //declare a set to track the consecutive sequence 
        Set<Integer> set = new HashSet<>();
        int max_length = 0 ; 
        set.add(nums[0]);

        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] == nums[i-1] + 1 || nums[i] == nums[i-1]){
                set.add(nums[i]);
            }
            else{
                set.clear();
                set.add(nums[i]);
            }
           max_length = Math.max(max_length , set.size());

        }
        return max_length;
    }
}
