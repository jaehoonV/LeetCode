class Solution {
    public double averageWaitingTime(int[][] customers) {
        double output = customers[0][1];
		int sum_time = customers[0][0] + customers[0][1], n = customers.length;
		for(int i = 1; i < n; i++){
			int arrival = customers[i][0];
			int time = customers[i][1];
			if(sum_time <=  arrival){
				output += time;
				sum_time = arrival + time;
			}else{
				output += sum_time - arrival + time;
				sum_time = sum_time + time;
			}
		}
		
		return output / n;
    }
}