package com.bridgelabz.workshop;

import java.util.Scanner;

public class Application {
    UserInterface userInterface = new UserInterface();
    SweetStore sweetStore = new SweetStore();
    final static int EXIT_VALUE = 5;

    public static void main(String[] args) {
        System.out.println("Welcome to Sweet Shop.");
        /*
         * Laddu laddu = new Laddu(); laddu.price=40; Barfi barfi = new Barfi(); Jalebi
         * jalebi = new Jalebi(); Rasgulla rasgulla = new Rasgulla();
         *
         * SweetStore sweetstore = new SweetStore(); sweetstore.add(jalebi);
         * sweetstore.add(laddu); sweetstore.add(barfi); sweetstore.add(rasgulla);
         *
         * UserInterface userInterface = new UserInterface();
         * userInterface.PrintAllSweet(sweetstore.getList());
         */
        int input = 0;
        Application app = new Application();
        while (input != app.EXIT_VALUE) {
            input = app.userInterface.showUserMenu();
            app.handleUserSelection(input);
        }
    }

    private void handleUserSelection(int input) {
        Scanner sc = new Scanner(System.in);
        Application app = new Application();

        switch (input) {
            case 1:
                Laddu laddu = new Laddu();
                laddu.price = 40;
                Barfi barfi = new Barfi();
                Jalebi jalebi = new Jalebi();
                Rasgulla rasgulla = new Rasgulla();
                Rasgulla rasgulla2 = new Rasgulla();

                sweetStore.add(jalebi);
                sweetStore.add(laddu);
                sweetStore.add(barfi);
                sweetStore.add(rasgulla);
                sweetStore.add(rasgulla2);
                break;
            case 2:
                System.out.println("Enter the name you want to delete");
                String sweetName = sc.next();

                Sweet name = sweetStore.getSweet(sweetName);
                sweetStore.removeSweet(name);
                break;
            case 3:
                System.out.println("Enter a sweet name you want to update");
                sweetName = sc.next();
                Sweet sweet = sweetStore.getSweet(sweetName);
                updateSweet(sweet);
                break;
            case 4:
                userInterface.printAllSweet(sweetStore.getList());
                break;

            case EXIT_VALUE:
                System.out.println("Thank you");
        }
    }

    Scanner sc = new Scanner(System.in);

    public void updateSweet(Sweet sweet) {
        System.out.println("Enter \n1.Shape\n2.Color");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                editShape(sweet);
                break;
            case 2:
                editColor(sweet);
                break;
            default:
                System.exit(0);
        }
    }

    private void editColor(Sweet sweet) {
        System.out.println("Enter \n1.RED \n2.GREEN \n3.YELLOW\n4.WHITE");
        int color = sc.nextInt();

        switch (color) {

            case 1:
                sweet.color = Sweet.Color.RED;
                break;

            case 2:
                sweet.color = Sweet.Color.GREEN;
                break;

            case 3:
                sweet.color = Sweet.Color.YELLOW;
                break;

            case 4:
                sweet.color = Sweet.Color.WHITE;
                break;
        }

    }

    private void editShape(Sweet sweet) {
        System.out.println("Enter \n1.TRIANGLE \n2.SQUARE \n3.ROUND");
        int shape = sc.nextInt();

        switch (shape) {

            case 1:
                sweet.shape = Sweet.Shape.TRIANGLE;
                break;

            case 2:
                sweet.shape = Sweet.Shape.SQUARE;
                break;

            case 3:
                sweet.shape = Sweet.Shape.ROUND;
                break;
        }
    }
}
