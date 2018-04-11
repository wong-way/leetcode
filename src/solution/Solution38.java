package solution;

/**
 * Created by DELL on 2017-07-08.
 */
public class Solution38 {
    public static String countAndSay(int n) {
        if(n == 1)
            return "1";
        String initString = countAndSay(n-1);
        String resultString = "";
        int count=1;
        for(int i = 1 ; i< initString.length();i++){

            if(initString.charAt(i)==initString.charAt(i-1)){
                count++;
                continue;
            }else{
                resultString= resultString+count+initString.charAt(i-1);
                count=1;
            }
        }
        System.out.println("n :"+n+"count :"+count);

        resultString = resultString+count+initString.charAt(initString.length()-1);
        System.out.println("result :"+resultString);
        return resultString;
    }

    public static void main(String[] args) {
        String result = countAndSay(6);
        System.out.println(result);
    }
}
