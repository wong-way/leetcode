package solution;

import java.util.*;

/**
 * Created by DELL on 2018-05-22.
 */
public class Solution18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int i = 0;
        int j = nums.length - 1;

        while (i < j-1) {
            System.out.println("begin"+i+" "+j+" "+nums[i]+" "+nums[j]);
            List<List<Integer>> t1 = twoSum(nums, i, j, target - nums[i] - nums[j]);
            for (List l : t1) {
                l.add(nums[i]);
                l.add(nums[j]);
                result.add(l);
            }
            System.out.println("begin"+i+" "+(j-1)+" "+nums[i]+" "+nums[j-1]);
            List<List<Integer>> t2 = twoSum(nums, i, j-1, target - nums[i] - nums[j-1]);
            for (List l : t2) {
                l.add(nums[i]);
                l.add(nums[j-1]);
                result.add(l);
            }
            System.out.println("begin"+(i+1)+" "+j+" "+nums[i+1]+" "+nums[j]);
            List<List<Integer>> t3 = twoSum(nums, i+1, j, target - nums[i+1] - nums[j]);
            for (List l : t3) {
                l.add(nums[i+1]);
                l.add(nums[j]);
                result.add(l);
            }
            i++;
            j--;
        }
        for (List l : result) {
            Collections.sort(l);
        }
        HashSet h = new HashSet(result);
        result.clear();
        result.addAll(h);
        return result;

    }

    public List<List<Integer>> twoSum(int[] nums, int exceptOne, int exceptTwo, int target) {
        System.out.println("target - "+target);
        int[] arr = new int[nums.length - 2];
        int index =0;
        for (int i = 0; i <nums.length; i++) {
            if (i != exceptOne && i != exceptTwo) {
                arr[index++] = nums[i];
            }
        }
        Arrays.sort(arr);
        List<List<Integer>> twoSumList = new ArrayList<>();
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
//            if (arr[i] + arr[j-1] == target) {
//                List<Integer> temp = new ArrayList<>();
//                temp.add(arr[i]);
//                temp.add(arr[j-1]);
//                twoSumList.add(temp);
//            }
//            if (arr[i+1] + arr[j] == target) {
//                List<Integer> temp = new ArrayList<>();
//                temp.add(arr[i+1]);
//                temp.add(arr[j]);
//                twoSumList.add(temp);
//            }
            if (arr[i] + arr[j] == target) {
                List<Integer> temp = new ArrayList<>();
                temp.add(arr[i]);
                temp.add(arr[j]);
                twoSumList.add(temp);
                i++;
                j--;
            }else if(arr[i] + arr[j] < target){
                i++;
            }else{
                j--;
            }
        }
        for (List l : twoSumList) {
            for (Object x : l) {
                System.out.print((int)x+" ");
            }
            System.out.println();
        }

        return twoSumList;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-3,-1,0,2,4,5};
        Solution18 solution= new Solution18();
        List<List<Integer>> list = solution.fourSum(arr, 0);
        for (List l : list) {
            for (Object x : l) {
                System.out.print((int)x+" ");
            }
            System.out.println();
        }
    }


}
