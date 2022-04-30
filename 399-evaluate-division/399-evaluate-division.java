class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        double[] output = new double[queries.size()]; // 반환할 double배열 생성
		Arrays.fill(output, -1.0); // -1.0으로 선언
		Map<String, String> map = new HashMap<>(); // equations
		
		int i = 0; // 초기값을 나타내는 변수

		for (List<String> e : equations) { // map에 key = a/b, value = 2.0 의 방식으로 put
			String s = e.get(0) + "/" + e.get(1);
			map.put(s, String.valueOf(values[i]));
			i++;
		}
		i = 0;

		// map의 key값을 바탕으로 새로운 equation을 생성하여 make_map에 저장
		while(true) {
			int temp_size = map.size();
			map = makeMap(map);
			if(temp_size == map.size())break;
		}
		
		for (List<String> q : queries) { // queries의 값을 map에서 찾고 value값을 output에 저장
			String q0 = q.get(0);
			String q1 = q.get(1);
			
			if(q0.equals(q1)){ // 같은 값으로 나누는 경우 
				for (String key : map.keySet()) {
					String temp_key[] = key.split("/");
					if(temp_key[0].equals(q0) || temp_key[1].equals(q0)) {
						output[i] = 1.0;
						break;
					}
				}
                i++;
				continue;
			}

			String s = q0 + "/" + q1;
			String s1 = q1 + "/" + q0;
			if (map.get(s) != null) {
				output[i] = Double.parseDouble(map.get(s));
				i++;
				continue;
			} else {
				if (map.get(s1) != null) {
					output[i] = 1 / Double.parseDouble(map.get(s1));
					i++;
					continue;
				}
			}
			i++;
		}

		return output;
	}

	private Map<String, String> makeMap(Map<String, String> map) { // map의 key값을 바탕으로 새로운 equation을 생성하여 make_map에 저장
		Map<String, String> make_map = new HashMap<>(); // map에서 만들어지는 equation
		
		for (String key : map.keySet()) {
			String value = map.get(key);
			String sub_key[] = key.split("/");
			for (String s_key : map.keySet()) {
				String s_value = map.get(s_key);
				String s_sub_key[] = s_key.split("/");
				// System.out.println(sub_key[0] + ", " + s_sub_key[1]);
				if (sub_key[0].equals(s_sub_key[1])) {
					String temp_s = s_sub_key[0] + "/" + sub_key[1];
					make_map.put(temp_s, String.valueOf(Double.parseDouble(value) * Double.parseDouble(s_value)));
				} else if (sub_key[0].equals(s_sub_key[0])) {
					String temp_s = s_sub_key[1] + "/" + sub_key[1];
					make_map.put(temp_s, String.valueOf(Double.parseDouble(value) / Double.parseDouble(s_value)));
				} else if (sub_key[1].equals(s_sub_key[0])) {
					String temp_s =  sub_key[0] + "/" + s_sub_key[1];
					make_map.put(temp_s, String.valueOf(Double.parseDouble(value) * Double.parseDouble(s_value)));
				} else if (sub_key[1].equals(s_sub_key[1])) {
					String temp_s =  sub_key[0] + "/" + s_sub_key[0];
					make_map.put(temp_s, String.valueOf(Double.parseDouble(value) / Double.parseDouble(s_value)));
				}
			}
		}
		map.putAll(make_map); // map과 make_map 합침
		return map;
	}
}