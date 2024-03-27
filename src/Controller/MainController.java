package Controller;

import View.MainView;
import java.util.Scanner;

public class MainController {
    private MainView view;
    private Scanner scanner;

    public MainController() {
        view = new MainView(this);
        scanner = new Scanner(System.in);
    }
}
