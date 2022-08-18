class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int half_leng = arr.length / 2;
        
        for(int n : arr) {
            hm.put(n, hm.getOrDefault(n, 0) + 1);
        }
        int output = 0;
        int temp = 0;
        // 리스트 내림차순 정렬 런타임 157ms, 메모리 88mb
//         List<Integer> listKeySet = new ArrayList<>(hm.keySet());

//         Collections.sort(listKeySet, (value1, value2) -> (hm.get(value2).compareTo(hm.get(value1))));
// 		for(int key : listKeySet) {
// 			temp += hm.get(key);
//             output++;
//             if(temp >= half_leng){
//                 return output;
//             }
// 		}
        
        // value값 정렬
        List<Integer> list = new ArrayList<>();
        for (int v : hm.values()) {
            list.add(v);
        }
        Collections.sort(list, Collections.reverseOrder());

        for(int l : list) {
			temp += l;
            output++;
            if(temp >= half_leng){
                return output;
            }
		}
        
        return 1;
    }
}