package epamTask3.output;


public class Output {
    private int[][] elements = new int[10][10];


    public Output(int[][] elements) {
        this.elements = elements;
    }

    public void print() {
        int n = 9;

        for (int i = 0; i < n; i++) {

            for (int l = 0; l <=n-i; l++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {

                if (elements[i][j] == 0){
                    System.out.print(" ");
                } else {
                    System.out.print(elements[i][j] + " ");
                }
            }
            System.out.print('\t');
            System.out.println();
        }
    }


    
}
