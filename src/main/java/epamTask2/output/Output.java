package epamTask2.output;

public class Output {
    private int[] perfect_numbers = new int[100];
    private int amount;

    public Output(int[] perfect_numbers, int amount) {
        this.perfect_numbers = perfect_numbers;
        this.amount = amount;
    }

    public void print() {
        System.out.print("Perfect numbers: 1 ");
        for (int i = 0; i < amount; i++) {
            System.out.print(perfect_numbers[i] + " ");
        }
    }
}
