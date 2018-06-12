package solution;

public class Solution476 {
    public int findComplement(int num) {
        String str ="";
        while(num!=0){
            str=((num&1)^1)+str;
            num=num>>1;

        }
        return Integer.valueOf(str,2);
    }
    public int findComplement1(int num) {
        return ((Integer.highestOneBit(num) << 1) - 1)-1;
    }

    public static void main(String[] args) {
        Solution476 solution = new Solution476();
        System.out.println(solution.findComplement(50));
    }
}
