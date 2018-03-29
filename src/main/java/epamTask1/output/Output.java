package epamTask1.output;


public class Output {
    private int[] binary = new int[10000];
    private char[] hexElements = new char[10000];
    private int hex;
    private int amount;

    public Output(char[] hexElements, int hex, int amount) {
        this.hexElements = hexElements;
        this.hex = hex;
        this.amount = amount;
    }

    public Output(int[] binary, int amount) {

        this.binary = binary;
        this.amount = amount;
    }

    public void print(int base) {
        System.out.print("Answer: ");
        switch (base) {
            case 2:case 8:
                for (int i = 0; i < amount; i++) {
                    System.out.print(binary[amount - (i + 1)]);
                }
            break;
            case 16:
                for (int i = 0; i <= amount; i++) {
                    System.out.print(hexElements[amount - i]);
                }
        }
    }

}
