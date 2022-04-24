class UndergroundSystem {
    
    HashMap<Integer, String[]> id_map = new HashMap<>(); // id_map 생성
    HashMap<String, int[]> avg_map = new HashMap<>(); // avg_map 생성

    public UndergroundSystem() {
        
    }
    
    // 체크인 id와 출발지, 시간(String으로 형변환)을 id_map에 put
    public void checkIn(int id, String stationName, int t) {
        id_map.put(id, new String[]{stationName, Integer.toString(t)});
    }
    
    public void checkOut(int id, String stationName, int t) {
        
        String temp_stationName = id_map.get(id)[0]; // 해당 id의 출발지
        int temp_time = Integer.parseInt(id_map.get(id)[1]); // 해당 id의 출발 시간
        
        id_map.remove(id); // id_map에서 데이터 제거

        String station_route = temp_stationName + "_" + stationName; // 루트 만들기 ex. Leyton-Waterloo
        int total_time = t - temp_time; // 체크아웃 시간에서 temp_time을 빼기

        // avg_map에 station_route가 존재하면 값을 반환 아니면 {0,0} 반환
        int[] route_time = avg_map.getOrDefault(station_route, new int[]{0, 0});
        
        // station_route와 해당 루트 시간과 count를 put
        avg_map.put(station_route, new int[]{route_time[0] + total_time, route_time[1] + 1});
        
    }
    
    public double getAverageTime(String startStation, String endStation) {
        
        String station_route = startStation + "_" + endStation; // 루트 만들기 ex. Leyton-Waterloo
        
        int total_time = avg_map.get(station_route)[0]; // 해당 루트 시간
        int count = avg_map.get(station_route)[1]; // count
        
        return (double)total_time / count;
    }
}
