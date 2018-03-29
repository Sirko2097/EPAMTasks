package epamTask3.pascal;


import output.Output;

public class Main {
    public static void main(String[] args) {
        PascalTriangle pascalTriangle = new PascalTriangle();
        pascalTriangle.combination();

        Output output = new Output(pascalTriangle.getElements());
        output.print();
    }
}
