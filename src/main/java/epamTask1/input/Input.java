package epamTask1.input;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
    private int number;
    private int base;
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void input(){

        try {
            System.out.print("epamTask1.input number: ");
            number = Integer.parseInt(reader.readLine());
            System.out.print("epamTask1.input base: ");
            base = Integer.parseInt(reader.readLine());
            reader.close();
        } catch (IOException ex){ex.printStackTrace();}

    }

    public int getBase() {
        return base;
    }

    public int getNumber() {
        return number;
    }
}
