package epamTask2.input;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
    private int number;

    public void inputData() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input the number: ");
        try {
            number = Integer.parseInt(reader.readLine());
            reader.close();
        } catch (IOException ex){ex.printStackTrace();}
    }

    public int getNumber() {
        return number;
    }


}
