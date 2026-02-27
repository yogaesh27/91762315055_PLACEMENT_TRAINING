import java.util.*;

class Q5{
    public String decodeString(String s) {
        Stack<Integer> counts = new Stack<>();
        Stack<String> resultStack = new Stack<>();
        StringBuilder current = new StringBuilder();
        int k = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                k = k * 10 + (c - '0'); 
            } else if (c == '[') {
                counts.push(k);
                resultStack.push(current.toString());
                current = new StringBuilder();
                k = 0;
            } else if (c == ']') {
                StringBuilder temp = new StringBuilder(resultStack.pop());
                int repeat = counts.pop();
                for (int i = 0; i < repeat; i++) {
                    temp.append(current);
                }
                current = temp;
            } else {
                current.append(c);
            }
        }

        return current.toString();
    }
}