class StaircaseSearch {
    // Two important condition to search key in sorted matrix

    // for cell (0,m-1)
    // if key < cell value
    // Move Left
    // if key > cell value
    // Move Bottom

    // !!!!

    // for cell (n-1,0)
    // if key < cell value
    // Move top
    // if key > cell value
    // Move right
    public static boolean staircaseSearch(int matrix[][], int key) {
        int row = 0;
        int col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) { // this is for cell (0,m-1)
            if (matrix[row][col] == key) {
                System.out.println("found at cell: " + "(" + row + "," + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("Not Found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 },
        };
        int key = 11;
        staircaseSearch(matrix, key);
    }
}
