class Solution {
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        int[] parent = new int[26];

        for (int i = 0; i < 26; i++) {
            parent[i] = i;
        }

        for (int i = 0; i < s1.length(); i++) {
            int a = s1.charAt(i) - 'a';
            int b = s2.charAt(i) - 'a';
            union(parent, a, b);
        }

        StringBuilder sb = new StringBuilder();
        for (char c : baseStr.toCharArray()) {
            int rep = find(parent, c - 'a');
            sb.append((char)(rep + 'a'));
        }

        return sb.toString();
    }

    private void union(int[] parent, int a, int b) {
        int pa = find(parent, a);
        int pb = find(parent, b);
        if (pa == pb) return;

        if (pa < pb) {
            parent[pb] = pa;
        } else {
            parent[pa] = pb;
        }
    }

    private int find(int[] parent, int x) {
        if (parent[x] != x) {
            parent[x] = find(parent, parent[x]);
        }
        return parent[x];
    }
}