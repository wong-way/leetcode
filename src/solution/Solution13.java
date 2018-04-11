package solution;

/**
 * Created by DELL on 2017-07-02.
 */
public class Solution13 {
    public static int romanToInt(String s) {
        int graph[] = new int[400];
        int result = 0;
        graph['I'] = 1;
        graph['V'] = 5;
        graph['X'] = 10;
        graph['L'] = 50;
        graph['C'] = 100;
        graph['D'] = 500;
        graph['M'] = 1000;
        result = graph[s.charAt(0)];
        for (int i = 0; i < s.length() - 1; i++) {
            System.out.println("roman num is :"+s.charAt(i)+","+"value is :"+graph[s.charAt(i)]);
            if (graph[s.charAt(i)] >= graph[s.charAt(i + 1)])
                result += graph[s.charAt(i + 1)];
            else
                result = result + graph[s.charAt(i + 1)] - 2 * graph[s.charAt(i)];
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "DCXXI";
        int test = romanToInt(s);
        System.out.println(test);
    }


}
