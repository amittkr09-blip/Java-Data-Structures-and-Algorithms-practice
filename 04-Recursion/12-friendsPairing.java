class friendsPairing {
    public static int frndsPairing(int n) {

        if (n == 1 || n == 2) {
            return n;
        }

        // Single
        int fnm1 = frndsPairing(n - 1);

        // Pair
        int fnm2 = frndsPairing(n - 2);
        int pairWays = (n - 1) * fnm2;

        // totalWays
        int totalWays = fnm1 + pairWays;
        return totalWays;

    }

    public static void main(String[] args) {
        System.out.println(frndsPairing(3));
    }
}
