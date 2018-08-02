package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution22 {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList();
        if (n == 0) return list;
        List<String> sub = generateParenthesis(n - 1);
        if (sub.size() == 0) {
            list.add("()");
        } else {
            for (int i = 0; i < sub.size(); i++) {
                String a = "()" + sub.get(i);
                String b = "(" + sub.get(i) + ")";
                list.add(a);
                list.add(b);
            }
        }

        return list;
    }

    public static void main(String[] args) {

        Solution22 s = new Solution22();
        List<String> list = s.generateParenthesis(3);
        System.out.println(Arrays.toString(list.toArray()));
    }
}
