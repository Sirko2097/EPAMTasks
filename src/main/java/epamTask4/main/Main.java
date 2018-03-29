package epamTask4.main;


import input.Input;

public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        input.randElements();

        Matrix matrix = new Matrix(input.getN(), input.getMatrix());
        matrix.change();
    }
}
