class Solution {
    public int evalRPN(String[] tokens) {
        // O(n)
        // you push - number ( operand )
        // you pop - operator ( 2x )
        // you push result onto stack 

        // when we are done with the strign ( postfix )
        // you will only have 1 ele in stack , so simply return that single ele 
        // thats ur result 

        Stack<Integer> stack = new Stack<>();
        Set<String> set = new HashSet<>(Set.of("+" , "-" , "*" , "/")) ;
        // traverse through the string 
        for(String str : tokens){
            if(!set.contains(str)){
                //int num = Integer.parseInt(str);
                stack.push(Integer.parseInt(str));
            } // check for number
            else{
                int e1 = stack.pop(); // 5 -> 6  => 5 - 6 
                int e2 = stack.pop();
                // int result = e2 [operator] e1
                int result = 0 ; 

                switch(str){
                    case "+" : result = e2 + e1;  break;
                    case "-" : result = e2 - e1;  break;
                    case "*" : result = e2 * e1;  break;
                    case "/" : result = e2 / e1;  break;
                    default : System.out.println("invalid operator");
                }
                stack.push(result);


            }

        }
        return stack.pop();

    }
}
