package solution;

public class Solution495 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries.length == 0) return 0;
        int totalDuration=0;
        for(int i = 1;i<timeSeries.length;i++){
            if(timeSeries[i]>timeSeries[i-1]+duration)
                totalDuration += duration;
            else{
                totalDuration+= timeSeries[i]-timeSeries[i-1];
            }
        }
        totalDuration+=duration;
        return totalDuration;
    }
}
