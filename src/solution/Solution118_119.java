package solution;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DELL on 2017-07-16.
 */
public class Solution118_119 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> mList = new ArrayList<List<Integer>>();
        for(int i = 0; i< numRows;i++){
            List<Integer> intList = new ArrayList<Integer>();
            for(int j=0;j<=i;j++){
                if(j == 0|| j==i)
                    intList.add(1);
                else{
                    intList.add(mList.get(i-1).get(j)+mList.get(i-1).get(j-1));
                }
            }
            mList.add(intList);
        }
        return mList;

    }
    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> mList = new ArrayList<List<Integer>>();
        for(int i = 0; i<=rowIndex;i++){
            List<Integer> intList = new ArrayList<Integer>();
            for(int j=0;j<=i;j++){
                if(j == 0|| j==i)
                    intList.add(1);
                else{
                    intList.add(mList.get(i-1).get(j)+mList.get(i-1).get(j-1));
                }
            }
            mList.add(intList);
        }
        return mList.get(rowIndex);
    }

    public static void main(String[] args) {
        int test =3;
        List<Integer> result = getRow(3);
        System.out.println(result);
    }
}
