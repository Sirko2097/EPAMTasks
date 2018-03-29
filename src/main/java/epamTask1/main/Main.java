package epamTask1.main;
import epamTask1.processing.Process;
import epamTask1.output.Output;
import epamTask1.input.Input;

public class Main {
    public static void main(String[] args) {
         Input input = new Input();
         input.input();

         Process process = new Process(input.getNumber());
         process.go(input.getBase());

         Output output;
         if (input.getBase() != 16){
             output = new Output(process.getBinary(), process.getAmount());
             output.print(input.getBase());
         } else {
             output = new Output(process.getHex(), input.getBase(), process.getAmount());
             output.print(input.getBase());
         }

    }
}
