package Arrays;

import java.util.ArrayList;

public class MergeIntervals {
	static  public class Interval {
		      int start;
		      int end;
		     Interval() { start = 0; end = 0; }
		      Interval(int s, int e) { start = s; end = e; }
		  }
	 public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
	       
	        ArrayList<Interval> output = new ArrayList<Interval>();
	         
	         int i = 0;
	         int size = intervals.size();
	         // Add all the points before we encounter the interval
	         while (i < size && newInterval.start > intervals.get(i).end) {
	             output.add(intervals.get(i));
	             i++;
	         }
	         
	         // For the overlapping ranges, compute the minimum start point and maximum end point of the range
	         while (i < size && newInterval.end >= intervals.get(i).start) {
	             newInterval.start = Math.min(newInterval.start, intervals.get(i).start);
	             newInterval.end = Math.max(newInterval.end, intervals.get(i).end);
	             i++;
	         }
	         output.add(newInterval);
	         
	         // Add the points after we encounter the interval
	         while (i < size) {
	             output.add(intervals.get(i));
	             i++;
	         }
	         return output;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
