public class nonrestoring {
    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 2;

        int quotient = 0;
        int remainder = dividend;

        for (int i = 0; i < 32; i++) {
            if (remainder >= 0) {
                remainder = remainder - divisor;
                quotient = quotient << 1;
                quotient = quotient | 1;
            } else {
                remainder = remainder + divisor;
                quotient = quotient << 1;
            }
            remainder = remainder << 1;
        }

        if (remainder < 0) {
            remainder = remainder + divisor;
            quotient = quotient - 1;
        }

        remainder = remainder >>> 1;

        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }
}