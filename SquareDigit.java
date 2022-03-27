/*Welcome. In this kata, you are asked to square every digit of a number and concatenate them.

For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.

Note: The function accepts an integer and returns an integer*/
public class SquareDigit {
    public int squareDigits(int n) {
        if (n < 10) return n * n;
        else {
            int h = squareDigits(n / 10);
            int l = n % 10;
            return Integer.parseInt(h + "" + l * l);
        }
    }
}
