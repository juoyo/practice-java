import sun.awt.windows.WPrinterJob;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class LC20 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isValid(")("));
    }
}

class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char tempC = s.charAt(i);
            if (map.get(tempC) == null) {  // 输入的值不在map的值中，即为左括号
                stack.push(tempC);
            } else if (stack.empty() || map.get(tempC) != stack.pop()) { //栈空，或输入的右括号和栈顶元素不匹配
                return false;
            }
        }
        // 字符串匹配完，栈空则为true
        return stack.empty();
    }
}