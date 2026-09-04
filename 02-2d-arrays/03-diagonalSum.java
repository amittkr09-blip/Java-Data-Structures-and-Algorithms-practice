class DiagonalSum {
    public static int getDiagonalSum(int matrix[][]) {
        int sum = 0;

        // BRUTE FORCE APPROACH

        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < matrix[0].length; j++) {

        // PRIMARY DIAGONAL

        // if (i == j) {
        // sum += matrix[i][j];
        // }

        // SECONDARY DIAGONAL

        // else if (i + j == matrix.length - 1) {
        // sum += matrix[i][j];
        // }
        // }
        // }

        // OPTIMIZED APPROACH

        for (int i = 0; i < matrix.length; i++) {

            // PRIMARY DIAGONAL

            sum += matrix[i][i];

            // SECONDARY DIAGONAL

            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - i - 1];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 },
        };
        System.out.println(getDiagonalSum(matrix));
    }

}