package day35;

public class modulo {
    // (a+b)%n=(a%n + b%n) %n
    // (a-b)%n=(a%n - b%n) %n
    // (a*b)%n=(a%n * b%n) %n
    // (a/b)%n=(a%n / b%n) %n

    static long fastPower(long a, long b, int n) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) != 0) {
                res = (res * a % n) % n;
            }
            a = (a % n * a % n) % n;
            b = b >> 1;// it will divide number by 2
        }
        return res;
    }

    public static void main(String[] args) {
        // a^b
        System.out.println(fastPower(3978432, 5, 100000007));

    }
}
