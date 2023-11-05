#include<stdio.h>

int main() {
    int i, ac = 0, qn = 0, qn1 = 1, sc = 8, m, q, temp;
    printf("Enter two numbers to be multiplied: ");
    scanf("%d %d", &m, &q);
    printf("\n\t\t\tAC\tQR\tQ(-1)\tSC\n");
    printf("\t\t\t%d\t%d\t%d\t%d\n", ac, q, qn1, sc);
    for (i = 0; i < sc; i++) {
        if (qn == qn1) {
            if (qn == 0) {
                // Shift right
                qn1 = qn;
                qn = q & 0x1;
                q = q >> 1;
                temp = ac & 0x1;
                ac = ac >> 1;
                ac = ac | (temp << 7);
                printf("Shift Right\t\t%d\t%d\t%d\t%d\n", ac, q, qn1, sc);
            } else if (qn == 1) {
                // Shift right
                qn1 = qn;
                qn = q & 0x1;
                q = q >> 1;
                temp = ac & 0x1;
                ac = ac >> 1;
                ac = ac | (temp << 7);
                printf("Shift Right\t\t%d\t%d\t%d\t%d\n", ac, q, qn1, sc);
            }
        } else if (qn > qn1) {
            // A = A + M
            ac = ac + m;
            printf("A = A + M\t\t%d\t%d\t%d\t%d\n", ac, q, qn1, sc);
            // Shift right
            qn1 = qn;
            qn = q & 0x1;
            q = q >> 1;
            temp = ac & 0x1;
            ac = ac >> 1;
            ac = ac | (temp << 7);
            printf("Shift Right\t\t%d\t%d\t%d\t%d\n", ac, q, qn1, sc);
        } else if (qn < qn1) {
            // A = A - M
            ac = ac - m;
            printf("A = A - M\t\t%d\t%d\t%d\t%d\n", ac, q, qn1, sc);
            // Shift right
            qn1 = qn;
            qn = q & 0x1;
            q = q >> 1;
            temp = ac & 0x1;
            ac = ac >> 1;
            ac = ac | (temp << 7);
            printf("Shift Right\t\t%d\t%d\t%d\t%d\n", ac, q, qn1, sc);
        }
        sc--;
    }
    printf("\n\nThe product of %d and %d is %d", m, q, ac);
    return 0;
}