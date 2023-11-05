public class booth {
    static int size = 5;
    static int carry = 0;
    static int[] ac = new int[size];
    static int[] qr = new int[size];
    static int[] qrn1 = new int[size];
    static int[] br = new int[size];

    public static void main(String[] args) {
        int m = 9, q = 4;
        binary(m, br);
        binary(q, qr);
        display();

        for (int i = 0; i < size; i++) {
            if (qr[0] == 1 && qrn1[0] == 0) {
                add(ac, br);
                display();
                shift();
            } else if (qr[0] == 0 && qrn1[0] == 1) {
                add(ac, twosComplement(br));
                display();
                shift();
            } else {
                shift();
            }
        }
        System.out.println("Product is = " + binaryToDecimal(ac));
    }

    static void binary(int n, int[] bin) {
        int i = size - 1;
        while (n != 0) {
            bin[i--] = n % 2;
            n /= 2;
        }
        while (i >= 0) {
            bin[i--] = 0;
        }
    }

    static void shift() {
        carry = ac[0];
        for (int i = 0; i < size - 1; i++) {
            ac[i] = ac[i + 1];
            qr[i] = qr[i + 1];
        }
        qr[size - 1] = carry;
    }

    static void add(int[] a, int[] b) {
        int carry = 0;
        for (int i = size - 1; i >= 0; i--) {
            int temp = a[i] + b[i] + carry;
            a[i] = temp % 2;
            carry = temp / 2;
        }
    }

    static int[] twosComplement(int[] a) {
        int[] complement = new int[size];
        int carry = 1;
        for (int i = 0; i < size; i++) {
            complement[i] = (a[i] == 0) ? 1 : 0;
        }
        for (int i = size - 1; i >= 0; i--) {
            int temp = complement[i] + carry;
            complement[i] = temp % 2;
            carry = temp / 2;
        }
        return complement;
    }

    static void display() {
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print(ac[i]);
        }
        System.out.print(" ");
        for (int i = 0; i < size; i++) {
            System.out.print(qr[i]);
        }
        System.out.println();
    }

    static int binaryToDecimal(int[] a) {
        int n = 0;
        for (int i = size - 1, j = 0; i >= 0; i--, j++) {
            n += a[i] * Math.pow(2, j);
        }
        return n;
    }
}