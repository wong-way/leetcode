package solution;

import java.util.*;

public class Solution349 {
    public int[] intersection(int[] nums1, int[] nums2) {

        List<Integer> list = new ArrayList<>();
        int index1 = 0;
        int index2 = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        while (index1 < nums1.length && index2 < nums2.length) if (nums1[index1] == nums2[index2]) {
            if (!list.contains(nums1[index1]))
                list.add(nums1[index1]);
            index1++;
            index2++;
        } else if (nums1[index1] < nums2[index2]) {
            index1++;
        } else {
            index2++;
        }

        int[] d = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            d[i] = list.get(i);
        }
        return d;
    }
    public int[] intersection1(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersect = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                intersect.add(nums2[i]);
            }
        }
        int[] result = new int[intersect.size()];
        int i = 0;
        for (Integer num : intersect) {
            result[i++] = num;
        }
        return result;
    }

}
