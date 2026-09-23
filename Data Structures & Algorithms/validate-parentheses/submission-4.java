class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        List<Character> open = List.of('(', '{', '[');
        for(int i = 0; i < s.length(); i++){
            Character item = s.charAt(i); 
            if(open.contains(item)){
                stack.push(item);
            }else  if(stack.isEmpty()){
                return false;
            }else  if(item.equals(')')){
                if(!stack.pop().equals('(')) return false;
            }else if(item.equals('}')){
                if(!stack.pop().equals('{')) return false;
            }else if(item.equals(']')){
                if(!stack.pop().equals('[')) return false;
            }else{
                return false;
            }
        }
        return stack.isEmpty();
    }
}
