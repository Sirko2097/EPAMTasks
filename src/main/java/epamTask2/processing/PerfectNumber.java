package epamTask2.processing;


class PerfectNumber {
    private int number;
    private int[] perfect_numbers = new int[100];
    private int amount;


    PerfectNumber(int number) {
        this.number = number;
    }

    void findPerfectNumber() {
        int i = 0;
        int sum;
        for (int j = 1; j < number; j++) {
            sum = 0;
            for (int k = 1; k < j; k++) {
                if (j % k == 0){
                    sum += k;
                }
            }
            if (sum == j) {
                perfect_numbers[i] = sum;
                i++;
                amount++;
            }
        }//close forj
    } //close findPerfectNumber()


    int[] getPerfect_numbers() {
        return perfect_numbers;
    }

    int getAmount() {
        return amount;
    }
}
