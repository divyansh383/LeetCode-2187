class Solution {
    boolean valid(long trips, int[] time, int totalTrips) {
        long sumTrips = 0;
        for (int i = 0; i < time.length; i++) {
            sumTrips += trips / time[i];
            if (sumTrips >= totalTrips) {
                return true;
            }
        }
        return false;
    }
    
    public long minimumTime(int[] time, int totalTrips) {
        long ans = 0;
        if (time.length == 1) {
            ans = (long) time[0] * totalTrips;
            return ans;
        }
        long low = 1;
        long maxt=Arrays.stream(time).max().getAsInt()*(long) totalTrips;
        long high = Math.min(maxt,Long.MAX_VALUE);

        while (low <= high) {
            long mid = (low + high) / 2;
            if (valid(mid, time, totalTrips)) {
                high = mid - 1;
                ans = mid;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}