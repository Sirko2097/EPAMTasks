package regex.service;

import controller.MainController;
import view.Menu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static view.IConstants.InputConstants.WRONG_INPUT;

public class Input {
    public void inputChoice() {
        MainController controller = new MainController();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char key = '0';

        while (true){
            new Menu().printMenu();
            try {
                key = reader.readLine().charAt(0);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            switch (key){
                case '1':
                    controller.addNewStudent();
                    break;
                case '2':
                    controller.printJournal();
                    break;
                case '3':
                    controller.changeLanguage();
                    break;
                case '4':
                    System.exit(0);
                    break;
                default:
                    System.out.println(Bundle.INSTANCE.getValue(WRONG_INPUT));
                    break;
            }
        }
    }
}
