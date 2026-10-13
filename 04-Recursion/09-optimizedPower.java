class optimizedPower {
    public static int optimizedPowers(int a, int n) {
        if (n == 0) {
            return 1;
        }
        // int halfPowerSq = optimizedPowers(a, n / 2) * optimizedPowers(a, n / 2);

        int halfPower = optimizedPowers(a, n/2);
        int halfPowerSq = halfPower * halfPower;
        // n is Odd

        if (n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;
    }

    public static void main(String[] args) {
        System.out.println(optimizedPowers(2, 5));
    }
}
