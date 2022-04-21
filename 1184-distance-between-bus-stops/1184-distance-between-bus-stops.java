class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int arr_sum = 0; 
        int sum = 0; 
        
        for(int i=0; i < distance.length; i++){ // 전체 합
            arr_sum += distance[i];
        }
        
        if(start >= destination){ // start, destiantion 비교
            int temp = destination;
            destination = start;
            start = temp;
        }
        
        for(int i = start; i < destination; i++){ // 거리 합
            sum += distance[i];
        }
        
        if(arr_sum - sum >= sum) return sum; // 비교하여 반환
        
        return (arr_sum - sum);
        
        
    }
}