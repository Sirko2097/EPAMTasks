package epamTask3.pascal;


class PascalTriangle {
    private int[][] elements = new int[10][10];

    private int factorial(int n) {
        int x = 1;
        if (n == 0) return 1;
        else {
            for (int i = 2; i <= n; i++) {
                x *= i;
            }
            return x;
        }
    }

    void combination() {
        int n = 9;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                elements[i][j] = factorial(i) / (factorial(j) * factorial(i - j));
            }
        }

    }



    int[][] getElements() {
        return elements;
    }
}
