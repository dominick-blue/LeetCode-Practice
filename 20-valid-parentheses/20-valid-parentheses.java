class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        
        Stack<Character> stack = new Stack<Character>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (map.containsKey(c)) {
                char topElement = stack.empty() ? '#' : stack.pop();
                
                if (topElement != map.get(c)) {
                    return false;
                }
            }
            else {
                stack.push(c);
            }
        }
        return stack.empty();
    }
}