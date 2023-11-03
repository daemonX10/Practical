public class control {
    public static class Control {
        public static void main(String[] args) {
            // if-else statement
            int num = 10;
            if (num > 5) {
                System.out.println("Number is greater than 5");
            } else {
                System.out.println("Number is less than or equal to 5");
            }

            // for loop
            for (int i = 0; i < 5; i++) {
                System.out.println("Value of i: " + i);
            }

            // while loop
            int count = 0;
            while (count < 5) {
                System.out.println("Value of count: " + count);
                count++;
            }

            // switch statement
            int day = 3;
            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                // you can add more cases for other days
                default:
                    System.out.println("Invalid day");
                    break;
            }
        }
    }
}
