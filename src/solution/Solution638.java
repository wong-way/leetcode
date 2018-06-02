package solution;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DELL on 2018-06-02.
 */
public class Solution638 {
    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        int count = Integer.MAX_VALUE;
        if (isAllZero(needs))
            return 0;
        for (List<Integer> list : special) {
            int temp = 0;
            int alone = 0;
            int combination = 0;

            for (int i = 0; i < needs.size(); i++) {
                alone += needs.get(i) * price.get(i);
            }

            if (isAllGreater(list, needs)) {
                List<Integer> newNeeds = new ArrayList<>();
                newNeeds.addAll(needs);
                for (int i = 0; i < newNeeds.size(); i++) {
                    newNeeds.set(i, newNeeds.get(i) - list.get(i));
                }
                combination = list.get(list.size() - 1) + shoppingOffers(price, special, newNeeds);
            }
            temp = Math.min(alone, combination);
            if (temp < count)
                count = temp;
            System.out.println(alone+"，"+combination+","+temp);
        }

        return count;
    }

    public boolean isAllZero(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != 0)
                return false;
        }
        return true;
    }

    public boolean isAllGreater(List<Integer> list1, List<Integer> list2) {
        for (int i = 0; i < list2.size(); i++) {
            if (list2.get(i) < list1.get(i))
                return false;
        }
        return true;
    }
    public int shoppingOffers1(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        return helper(price, special, needs, 0);
    }

    private int helper(List<Integer> price, List<List<Integer>> special, List<Integer> needs, int pos) {
        int local_min = directPurchase(price, needs);
        for (int i = pos; i < special.size(); i++) {
            List<Integer> offer = special.get(i);
            List<Integer> temp = new ArrayList<Integer>();
            for (int j= 0; j < needs.size(); j++) {
                if (needs.get(j) < offer.get(j)) { // check if the current offer is valid
                    temp =  null;
                    break;
                }
                temp.add(needs.get(j) - offer.get(j));
            }

            if (temp != null) { // use the current offer and try next
                local_min = Math.min(local_min, offer.get(offer.size() - 1) + helper(price, special, temp, i));
            }
        }

        return  local_min;
    }

    private int directPurchase(List<Integer> price, List<Integer> needs) {
        int total = 0;
        for (int i = 0; i < needs.size(); i++) {
            total += price.get(i) * needs.get(i);
        }

        return total;
    }
}
