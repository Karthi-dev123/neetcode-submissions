class Solution {
    public int characterReplacement(String s, int k) {
        // //BAAABABABABB // K = 2 
        // // int max = 0 ;
        // 1- > //B -> ( window_length - freq_max ) < = k --> u can increase the window size
        // 2 - > //BA -> (2-1)=> 1 < 2 --> increase the window size 
        // 3 -> // BAA --> (3-2)=> 1 < 2 --> increase the window size 
        // 4 - > // BAAA --> (4-3)=> 1 < 2 -->  increase the window size
        // 5 - > // BAAAB --> (5-3) => 2 < = 2 --> valid so incresae the window size 
        // 6 - > // BAAABA --> (6-4)=> 2 <= 2 --> increase the window size 
        // // BAAABAB --> (7-4) => 3 !<= 2 
        // 6 - > // AAABAB --> (6-4) => 2 <=2 --> increase window 
        // 7 - > // AAABABA --> (7-5) => 2 <= 2 --> increase window 
        // // AAABABAB -> (8-5) => 3 !<= 2 
        // // AABABABA --> (8-5) => 3 !<=2 
        // // ABABABAB --> (8-4) => 4 !<= 2 
        // // BABABABB --> (8-5) => 3 !<= 2 
        // ABABABB --> (7-4) => 3 ! <= 2 
        // BABABB --> (6-4) => 2 <= 2 this is valid , but since right side has reached the end we cant grow no. 
        //
        //
        //BB
        //B

        
        HashMap<Character,Integer> map = new HashMap<>(); // {A : 0 ,B: 0 ,C : 0 ,D : 0  }
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i = 0 ; i < alphabet.length() ; i++){
            map.put(alphabet.charAt(i),0);
        }

        int left = 0; 
        int right = 0;
        //map.put(s.charAt(left) , map.get( s.charAt(left) ) + 1 ) ;
        int max_len = 0;
        
        
        while(right < s.length()){
            map.put(s.charAt(right) , map.get(s.charAt(right)) + 1 );
            int window_length = (right - left) + 1 ; 
            //pick up max freq 
            int freq_max = 0;
            for(Character ch : map.keySet()){
                //int val = map.get(ch);
                freq_max = Math.max(freq_max , (int)map.get(ch));
            } 
            while((window_length - freq_max ) >  k){
                map.put(s.charAt(left) , map.get(s.charAt(left)) - 1 );
                left++;
                window_length = (right - left) + 1 ;
                freq_max = 0;
                for(Character ch : map.keySet()){
                //int val = map.get(ch);
                    freq_max = Math.max(freq_max , (int)map.get(ch));
                }

            }
            window_length = (right - left) + 1 ;
            max_len = Math.max(window_length , max_len);
            right++;


        }
        return max_len;

    }
}
