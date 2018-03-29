package epamTask4.input;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Input {
    private int n;
    private int[][] matrix = new int[50][50];

    public void randElements() {

        System.out.print("Enter the number of elements: ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            n = Integer.parseInt(reader.readLine());
        } catch (Exception ex){
            ex.printStackTrace();
        }

        double sign;
        for (int row = 0; row < n; row++) {
            for (int column = 0; column < n; column++) {
                sign = Math.random();
                matrix[row][column] = sign > 0.5 ? (int) (Math.random()*10) :  (int) (-Math.random()*10);
            }
        }

        System.out.println("Initial matrix: ");

        for (int row = 0; row < n; row++) {
            for (int column = 0; column < n; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public int getN() {
        return n;
    }
}
