package epamTask1.processing;

public class Process {
    private int number;
    private int amount;
    private int[] binary = new int[10000];
    private char[] hex = new char[10000];


    public Process(int number) {
        this.number = number;
    }

    public void go(int base){
        switch (base) {
            case 2:case 8: division(base); break;
            case 16:
                hex();
                break;
        }
    }

    private void division(int base) {
        while (number != 0) {
            binary[amount] = (number % base);
            amount++;
            number = number / base;
        }
    }

    private void hex() {
        int elem;
        while (number != 0) {
            elem = number % 16;
            switch (elem){
                case 10:
                    hex[amount] = ('A');
                    break;
                case 11:
                    hex[amount] = ('B');
                    break;
                case 12:
                    hex[amount] = ('C');
                    break;
                case 13:
                    hex[amount] = ('D');
                    break;
                case 14:
                    hex[amount] = ('E');
                    break;
                case 15:
                    hex[amount] = ('F');
                    break;
                default:
                    hex[amount] = ((char)(elem + '0'));
                break;
            }
            number = number / 16;
            amount++;
        }

    }
    public char[] getHex() {
        return hex;
    }

    public int[] getBinary() {
        return binary;
    }

    public int getAmount() {
        return amount;
    }
}
