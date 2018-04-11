package solution;

/**
 * Created by DELL on 2017-07-10.
 */
public class Solution67 {
    public static String addBinary(String a, String b) {
        String shorterStr,longerStr;
        shorterStr = a.length()<b.length()?a:b;
        longerStr = a.length()>b.length()?a:b;
        String str = "" ;
        int carry =0;
        for(int i = 0 ;i<shorterStr.length();i++){
            int bit = ((a.charAt(a.length()-1-i)-'0') + (b.charAt(b.length()-1-i)-'0')+carry)%2;
            carry=((a.charAt(a.length()-1-i)-'0') + (b.charAt(b.length()-1-i)-'0')+carry)/2;
            str = bit+str;
        }
        for(int j = shorterStr.length();j<longerStr.length();j++){
            int bit =((longerStr.charAt(longerStr.length()-1-j)-'0')+carry)%2;
            carry =((longerStr.charAt(longerStr.length()-1-j)-'0')+carry)/2;
            str = bit +str;
        }
        if(carry == 1)
            str= "1"+str;
        return  str;

    }
    public static void main(String[] args) {
        String one ="11";
        String two = "1";
        String result = addBinary(one,two);
        System.out.println(result);
    }

}
