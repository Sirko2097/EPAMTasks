package epamTask4.main;


class Matrix {
    private int n;
    private int[][] matrix = new int[50][50];

    Matrix(int n, int[][] matrix) {
        this.n = n;
        this.matrix = matrix;
    }

    void change() {

        System.out.println("Modified matrix: ");

        for (int row = n - 1; row >= 0; row--) {
            for (int column = 0; column < n ; column++) {
                System.out.print(matrix[column][row] + " ");
            }
            System.out.println();
        }
    }
}
