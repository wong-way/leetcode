package solution;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DELL on 2018-04-10.
 */
public class Solution202 {
    public int next(int n) {
        int result = 0;
        while (n > 0) {
            int remainder = n % 10;
            result += remainder * remainder;
            n /= 10;
        }
        return result;
    }

    public boolean isHappy2(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = next(slow);
            fast = next(next(fast));
            if (slow == 1 || fast == 1) {
                return true;
            }
        } while (slow != fast);
        return false;
    }
    public static boolean isHappy(int n) {
        List<Integer> list = new ArrayList<Integer>();
        while (n != 1) {
            int temp = n;
            int next = 0;
            while (temp != 0) {
                next += Math.pow(temp % 10, 2);
                temp /= 10;
            }
            if (list.contains(next)) {
                return false;
            } else {
                n = next;
                list.add(next);
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Boolean result = isHappy(20);
        if (result) {
            System.out.println("快乐数");
        } else {
            System.out.println("非快乐数");
        }
    }
}
