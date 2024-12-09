import java.util.*;

class Interval implements Comparable<Interval> {
    int start, end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Interval other) {
        return this.end - other.end; // Sort by finish time
    }
}

public class IntervalScheduling {
    public static int maxNonOverlappingIntervals(int[] starts, int[] ends) {
        int n = starts.length;
        List<Interval> intervals = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            intervals.add(new Interval(starts[i], ends[i]));
        }

        // Sort intervals by finish time
        Collections.sort(intervals);

        int count = 0;
        int lastEndTime = Integer.MIN_VALUE;

        for (Interval interval : intervals) {
            if (interval.start >= lastEndTime) {
                lastEndTime = interval.end;
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] starts = new int[n];
        int[] ends = new int[n];

        for (int i = 0; i < n; i++) {
            starts[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            ends[i] = sc.nextInt();
        }

        int result = maxNonOverlappingIntervals(starts, ends);
        System.out.println(result);

        sc.close();
    }
}
