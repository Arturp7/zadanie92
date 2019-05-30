public class DigitSum {


    int sum(int x) {
        int digit = 0;
        while (x != 0) {
            digit = digit + x % 10;
            x = x / 10;
        }
        return digit;
    }

}
