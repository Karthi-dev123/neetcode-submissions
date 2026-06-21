
class Solution { 
    // any syntax error , nan porupu illai
    public boolean checkInclusion(String s1, String s2) {
        // dict 
        HashMap<Character,Integer > map = new HashMap<>();
        for(char ch: s1.toCharArray()){
            // if key already present , just increment ++
            if(map.containsKey(ch)) map.put( ch , map.get(ch)+1 );
            // if not present , just add one 
            else map.put(ch,1);
        }

        int i = 0 ;
        while(i < s2.length() - (s1.length() - 1) ){
            HashMap<Character,Integer> temp_map = new HashMap<>(map);
            for(int j = 0 ; j < s1.length() ; j++){
                if( temp_map.containsKey(s2.charAt(i+j)) ) temp_map.put( s2.charAt(i + j) , temp_map.get(s2.charAt(i+j))-1 );
                else continue;
            }
            boolean flag = true;
            for(char ch: temp_map.keySet()){
                if(temp_map.get(ch) != 0){
                    flag = false;
                    break;
                }
            }
            if(flag) return true;

            i+=1;

        }
        return false;





    }
}
