class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] count = new int[26], tmp;
        int i;
        // words2 문자 횟수 저장
        for (String b : words2) {
            tmp = counter(b);
            for (i = 0; i < 26; ++i)
                count[i] = Math.max(count[i], tmp[i]);
        }
        List<String> res = new ArrayList<>();
        for (String a : words1) {
            tmp = counter(a);
            for (i = 0; i < 26; ++i)
                if (tmp[i] < count[i]) // words2의 문자 횟수가 많을 경우 break
                    break;
            if (i == 26) res.add(a); // 문자 횟수 비교가 모두 끝나면 반환할 list에 add
        }
        return res;
    }

    int[] counter(String word) { // 문자 횟수 저장 함수
        int[] count = new int[26];
        for (char c : word.toCharArray()) count[c - 'a']++;
        return count;
    }
}