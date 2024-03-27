package View;

import Controller.MainController;

public class MainView {

    private MainController controller;

    public MainView(MainController controller) {
        this.controller = controller;
    }

    public void printMessage(String message) {
        System.out.print(message);
    }
}
