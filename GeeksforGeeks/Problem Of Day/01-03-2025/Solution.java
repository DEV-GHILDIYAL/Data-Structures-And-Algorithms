import java.util.Stack;

public class Solution {
    static String decodeString(String s) {
        Stack<String> st = new Stack<>();
        Stack<Integer> numStack = new Stack<>();
        StringBuilder currStr = new StringBuilder();
        int num = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0'); // Construct the full number
            } else if (ch == '[') {
                numStack.push(num);
                num = 0;
                st.push(currStr.toString());
                currStr = new StringBuilder();
            } else if (ch == ']') {
                StringBuilder decodedStr = new StringBuilder(st.pop());
                int repeatTimes = numStack.pop();
                decodedStr.append(currStr.toString().repeat(repeatTimes));
                currStr = decodedStr;
            } else {
                currStr.append(ch);
            }
        }
        
        return currStr.toString();
    }

    public static void main(String[] args) {
        String s = "3[a2[c]]";
        System.out.println(decodeString(s)); // Output: accaccacc
    }
}
