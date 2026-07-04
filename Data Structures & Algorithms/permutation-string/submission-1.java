class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int window_size = s1.length();
        // create a hashmap for the input string s1 
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s1.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            }else{
                map.put(ch , 1);
            }
        }

        for(int i = 0 ; i < (s2.length() - window_size + 1) ; i++ ){
            // i -> 1st value in window
            // i + 1 -> 2nd val in window 
            // i + 2 -> 3rd value in window 
            // i + (n-1) -> nth value in window 
            HashMap<Character,Integer> temp = new HashMap<>(map);
            // what logic do u use inside the window 
            // 1. pick a character 
            // 2. check if its in map 
            // => if yes -> subtract the frequency by -1 
            // => if no -> simply continue ( skip this iteration)
            // at the end of this , run through the map , if all values are zero , then update the flag variable and return true . 
        
            for(int j = i ; j <  i + window_size ; j++){
                if(temp.containsKey(s2.charAt(j))){
                    temp.put( s2.charAt(j) , temp.get(s2.charAt(j))- 1) ;
                }else{
                    continue;
                }
                
            }

            boolean flag = true ;
            for(Character ch : temp.keySet()){
                if(temp.get(ch) != 0){
                    flag = false;
                }
            }
            if(flag) return true;
        }
        return false;
    }
}
