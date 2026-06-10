// class Solution {
//     public List<List<String>> groupAnagrams(String[] strs) {


//         List<String> copy = new ArrayList<>(Arrays.asList(strs));


//         List<List<String>> l = new ArrayList<>();

//         while(!copy.isEmpty()){
//             List<String> temp = new ArrayList<>();
//             temp.add(copy.get(0));

//             if(copy.size() > 1){
//                 for(int j = 1 ; j < copy.size() ; j++){
//                     if(isAnagram(copy.get(0) , copy.get(j))){
//                         temp.add(copy.get(j));  
//                     }
//                 }
//                 l.add(temp);
//             }
//             else{
//                 l.add(temp);
//             }
//             for(int i = 0 ; i < temp.size() ; i++){
//                 copy.remove(temp.get(i));
//             }
//         }

//         return l;



//     }
//     public boolean isAnagram(String s1 , String s2){
//         if(s1.length() != s2.length()) return false;

//         Map<Character , Integer> map = new HashMap<>();
//         for(char ch : s1.toCharArray()){
//             if(map.containsKey(ch)){
//                 map.put(ch , map.get(ch) + 1);
//             }
//             else{
//                 map.put(ch , 1);
//             }
//         }
//         for(char ch : s2.toCharArray()){
//             if(map.containsKey(ch)){
//                 map.put(ch , map.get(ch) - 1);
//             }
//             else{
//                 return false;
//             }
//         }
//         // to check the hashmaps 
//         for(char ch : map.keySet()){
//             if(map.get(ch) != 0){
//                 return false;
//             }
//         }
//         return true ;
        
//     }
// }

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) { 
        //create an empty list of lists to hold strings
        List<List<String>> op = new ArrayList<>();
        outer: 
            for(String s: strs) {
                if(op.isEmpty()) {
                    List<String> mini = new ArrayList<>();
                    mini.add(s);
                    op.add(mini);
                    continue;
                }
                for(List<String> m : op) {
                    if(isAnagram(s,m.get(0))) {
                        m.add(s);
                        continue outer;


                        
                    }
    
                }
                //create a new object and add to op
                //op.add(new ArrayList<String>(s));
                List<String> k = new ArrayList<>();
                k.add(s);
                op.add(k);
            }
            return op;
        }
        //anagram function
        public Boolean isAnagram(String s1, String s2) {
            if(s1.length() != s2.length()) {
                return false;
            }
            //write hashmap declaration
            Map<Character, Integer> map = new HashMap<>();
            for(char c: s1.toCharArray()) {
                //check if character is present in anagram
                if(map.containsKey(c)) {
                    map.put(c,map.get(c)+1);
                }
                else {
                    map.put(c,1);
                }
            }
            for(char c: s2.toCharArray()) {
                if(map.containsKey(c)) {
                    map.put(c, map.get(c)-1);
                }
                else {
                    return false;
                }
            }
            //pick a key & if = to 0 => anagrams 
            for(char key: map.keySet()) {
                if(map.get(key) != 0) {
                    return false;
                }
            }
            return true;
    }
}