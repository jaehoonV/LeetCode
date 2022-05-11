class Solution {
    public int countVowelStrings(int n) {
        // 15(5 4 3 2 1)
        // 15(5+4+3+2+1)aaa aae aai aao aau aee aei aeo aeu aii aio aiu auu auo aoo
        // 10(4+3+2+1)eee eei eeo eeu eii eio eiu eoo eou euu
        // 6(3+2+1)iii iio iiu ioo iou iuu
        // 3(2+1)ooo oou ouu
        // 1 uuu
        // 35
        
        int output = 0;
        for (int j=1; j<=(n+1); j++) {
            int sum = 0;
            for (int i=1; i<=j; i++) {
                sum += i; // 1, 1+3, 1+3+6, 1+3+6+10, 1+3+6+10+15
                output += sum;
            }
        }
        return output;
    }
}