class Solution {
    public boolean isPathCrossing(String path) {
        int x = 0, y = 0;
        Set<String> set = new HashSet<>();
        set.add("0,0");

        for (char c : path.toCharArray()) {
            if (c == 'E') x++;
            else if (c == 'W') x--;
            else if (c == 'N') y++;
            else y--;

            String temp = x + "," + y;
            if (set.contains(temp)) return true;

            set.add(temp);
        }

        return false;
    }
}