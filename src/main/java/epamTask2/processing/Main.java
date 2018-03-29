package epamTask2.processing;


import input.Input;
import output.Output;

public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        input.inputData();

        PerfectNumber perfectNumber = new PerfectNumber(input.getNumber());
        perfectNumber.findPerfectNumber();

        Output output = new Output(perfectNumber.getPerfect_numbers(), perfectNumber.getAmount());
        output.print();
    }
}
