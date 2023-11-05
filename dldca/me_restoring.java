public class me_restoring {
    public static void main(String[] args) {
        int dividend = 10;
        int divisor= 2;

        int quotient = 0;
        int remainder = dividend;

        for(int i =0;i<32;i++){
            remainder = remainder -divisor;

            if(remainder<0){
                remainder = remainder+divisor;
            }else{
                quotient = quotient+1;
            }

            // The lines `quotient = quotient <<1;` and `remainder = remainder<<1;` are performing left
            // shift operations on the variables `quotient` and `remainder` respectively.
            quotient = quotient <<1;
            remainder = remainder<<1;
        }

        quotient = quotient >>>1;
        remainder= remainder>>>1;

        System.out.println(quotient);
        System.out.println(remainder);
    }
}
