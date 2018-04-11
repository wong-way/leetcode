package solution;

/**
 * Created by DELL on 2017-07-09.
 */
public class Solution58 {
    public static int lengthOfLastWord(String s) {
        if(s.replaceAll(" ","").isEmpty())
            return 0;
        s= s.trim();
        int index =0;
            index = s.lastIndexOf(' ');
        return s.length()-1-index;

    }
    public static int lengthOfLastWort1(String s){
        if(s.length()==0)
            return 0;
        int end = s.length();
        int begin = -1;
        for(int i = s.length()-1; i>= 0 ;i--){
            if(s.charAt(i)==' '&&end-i-1<1)
                end = i;
            if (s.charAt(i)==' '&&end -i>1){
                begin = i;
                break;
            }
        }
        System.out.println(end-begin-1);
        return end-begin-1;
    }


    public static void main(String[] args) {
        String test = " ";
        int result = lengthOfLastWord(test);
        System.out.println(result);
    }
}
