package regex.view;

import service.Bundle;

import static view.IConstants.Menu.*;


public class Menu implements IConstants {
    private Bundle bundle = Bundle.INSTANCE;

    public void printMenu() {
        System.out.println(bundle.getValue(MENU_ELEMENT_1));
        System.out.println(bundle.getValue(MENU_ELEMENT_2));
        System.out.println(bundle.getValue(MENU_ELEMENT_3));
        System.out.println(bundle.getValue(MENU_ELEMENT_4));
        System.out.println(bundle.getValue(MENU_ELEMENT_5));
    }
}
