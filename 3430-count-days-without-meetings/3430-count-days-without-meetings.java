class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));

        int output = 0;
        int lastmeet = 0;
		
        for(int[] m : meetings){
            if(lastmeet < m[0])
                output += m[0] - lastmeet - 1;
				
            lastmeet = lastmeet > m[1] ? lastmeet : m[1];
        }
        if(lastmeet <= days)
            output += days - lastmeet;
        
        return output;
    }
}