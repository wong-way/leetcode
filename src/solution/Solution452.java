package solution;

import java.util.Arrays;
import java.util.Comparator;

public class Solution452 {
    class Range {
        int low;
        int high;

        public Range(int low, int high) {
            this.low = low;
            this.high = high;
        }

        public Range getIntersection(Range range) {
            if (this.low > range.high || this.high < range.low)
                return null;
            else {
                int lowTmp = low > range.low ? low : range.low;
                int highTmp = high > range.high ? range.high : high;
                return new Range(lowTmp, highTmp);
            }
        }
    }

    public int findMinArrowShots(int[][] points) {
        if (points.length == 0)
            return 0;
        Arrays.sort(points, Comparator.comparing((int[] arr) -> arr[0]));
        int num = 1;
        int index = 0;//记录当前射爆气球的位置
        Range range = new Range(points[0][0], points[0][1]);
        for (int i = 1; i < points.length; i++) {
            Range now = new Range(points[i][0], points[i][1]);
            Range commen = range.getIntersection(now);
            if (commen == null) {
                num++;
                range = now;
            } else {
                range = commen;
            }
        }
        return num;
    }

    public int findMinArrowShots1(int[][] points) {
        if (points.length == 0)
            return 0;
        Arrays.sort(points, Comparator.comparing((int[] arr) -> arr[0]));

        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o2[0], o1[0]);
            }
        });
        int num = 1;
        int end = points[0][1];//记录当前射爆气球的位置
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > end) {
                num++;
                end = points[i][1];
            } else {
                end = end > points[i][1] ? points[i][1] : end;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int[][] points = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};

    }
}
