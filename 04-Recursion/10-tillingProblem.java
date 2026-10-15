class tilingProblem {
    public static int tilingPrb(int n) {
        if(n == 0 || n == 1){
            return 1;
        }

        // vertiacl choice
        int fnm1 = tilingPrb(n - 1);

        // horizontal choice
        int fnm2 = tilingPrb(n - 2);
        int totalWays = fnm1 + fnm2;
        return totalWays;
    }

    public static void main(String[] args) {
        System.out.println(tilingPrb(4));
    }
}
