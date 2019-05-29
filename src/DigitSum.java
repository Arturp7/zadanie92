public class DigitSum {
    int x;
    int digit;

    int sum(int x) {
        digit = 0;
        while (x != 0) {
            digit = digit + x % 10;
            x = x / 10;
        }
        return digit;
    }

}
