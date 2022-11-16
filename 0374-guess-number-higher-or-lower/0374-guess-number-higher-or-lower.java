/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        if(guess(n) > 0){
            n = search(n, n * 2);
        } else if(guess(n) < 0){
            n = search(1, n);
        }
        return n; 
    }
    
    public int search(int a, int n){
        int output = a + (n - a) / 2;
        if(guess(output) > 0){
            return search(output + 1, n);
        }else if(guess(output) < 0){
            return search(a, output - 1);
        }
        return output;
    }
}