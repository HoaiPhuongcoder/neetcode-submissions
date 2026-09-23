class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        
        for(int i = 0; i < s.length(); i++){
            Character c = s.charAt(i); 
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
                continue;
            }

            Character expected = switch(c){
                case ')' -> '(';
                case '}' -> '{';
                case ']' -> '[';
                default -> '\0';
            };

            if(expected == '\0' || stack.isEmpty() || stack.pop() != expected  ){
                return false;
            }
            
        }
        return stack.isEmpty();
    }
}
