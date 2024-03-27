package Controller;

import Model.BeverageType;
import Model.User;
import View.MainView;
import java.util.Scanner;

public class MainController {
    private MainView view;
    private Scanner scanner;
    private BeverageType[] beverageType;

    public MainController() {
        view = new MainView(this);
        scanner = new Scanner(System.in);
        beverageType = BeverageType.values();
        enterUserInfo();
    }

    private void enterUserInfo() {
        view.printMessage("Enter username: ");
        String username = scanner.nextLine();
        view.printMessage("Enter age: ");
        int age = Integer.parseInt(scanner.nextLine());
        view.printMessage("Enter weight in kg: ");
        int weight = Integer.parseInt(scanner.nextLine());
        view.printMessage("Enter length in cm: ");
        int length = Integer.parseInt(scanner.nextLine());
        User user = new User(username,age, length, weight);
        view.printMessage("Hello " + username + "!\n");
        enterCoffeeProduct(user);
    }

    private void enterCoffeeProduct(User user) {
        view.printMessage("Which coffee product did you drink?\n");
        BeverageType chosenBeverage = null;
        for (int i = 0; i < beverageType.length; i++) {
            String beverage = beverageType[i].toString().replaceAll("_"," ");
            view.printMessage(i+1 + ". " + beverage + "\n");
        }
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                chosenBeverage = BeverageType.Small_coffee;
                break;
            case 2:
                chosenBeverage = BeverageType.Large_coffee;
                break;
            case 3:
                chosenBeverage = BeverageType.Energydrink;
        }
    }
}
