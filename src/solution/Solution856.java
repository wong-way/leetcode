package solution;

public class Solution856 {
    public int scoreOfParentheses(String S) {
        int score = 0;
        int i = 0;
        while(i<S.length()){
            if(S.charAt(i)=='('){
                int end = findMatchedparentheses(S,i);
                String sub = S.substring(i+1,end);
                if(sub.length()>0)
                    score=score+2*scoreOfParentheses(sub);
                else
                    score=score+1;
                i=end+1;
            }
        }
        return score;
    }
    private int findMatchedparentheses(String S,int start){
        int index=0 ;
        for(int i = start;i<S.length();i++){
            if(S.charAt(i)=='(')
                index ++;
            else
                index --;
            if(index == 0)
                return i;
        }
        return 0;
    }
    public int scoreOfParentheses1(String S) {
        int ans = 0, bal = 0;
        for (int i = 0; i < S.length(); ++i) {
            if (S.charAt(i) == '(') {
                bal++;
            } else {
                bal--;
                if (S.charAt(i-1) == '(')
                    ans += 1 << bal;
            }
        }

        return ans;
    }
}
