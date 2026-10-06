package com.sofia.catalog;

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private Register register;

    public UserInterface(Register register, Scanner scanner) {
        this.scanner = scanner;
        this.register = register;
    }

    public void start() {

        System.out.println("Enter a grade (or type 'exit' to quit)");

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            if (input.equalsIgnoreCase("list")) {
                System.out.println(register.listGrades());
                continue;
            }
            if (input.equalsIgnoreCase("clear")) {
                register.clear();
                System.out.println("All grades removed.");
                continue;
            }
            try {
                input = input.replace(",", ".");
                double grade = Double.parseDouble(input);
                register.add(grade);
                System.out.println("Current average: " + register.averageOfGrades());
                System.out.println("You have added " + register.count() + " grades.");
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number or 'exit' to quit.");
            }
        }
    }
}
