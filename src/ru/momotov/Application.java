package ru.momotov;

import java.util.Scanner;

// ВАРИАНТ 3.6
// 1. Конструктор, создающий пустое дерево
// 2. Метод добавления значения в дерево
// 3. Метод получения максимального значения в дереве
// 4. Метод вывода всех элементов дерева в порядке убывания

public class Application {

    private BinaryTree binaryTree = new BinaryTree();

    public void run() {
        String num = userChoice();
        while (!num.equals("0")) {
            switch (num) {
                case "1":
                    addNewValue();
                    break;
                case "2":
                    getMaxValue();
                    break;
                case "3":
                    showAllValues();
                    break;
            }
            num = userChoice();
        }
    }

    private void addNewValue() {
        Scanner in = new Scanner(System.in);
        System.out.print("New value: ");
        String value = in.nextLine();
        binaryTree.add(value);
    }

    private void getMaxValue() {
        String maxValue = binaryTree.max();
        if (maxValue == null) {
            System.out.println("Binary tree is empty!");
        } else {
            System.out.println("Max value: " + maxValue);
        }
    }

    private void showAllValues() {
        binaryTree.print();
    }

    private String userChoice() {
        showMenu();
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    private void showMenu() {
        System.out.println("-----------------");
        System.out.println("MENU:");
        System.out.println("-----------------");
        System.out.println("1. Add value");
        System.out.println("2. Show max value");
        System.out.println("3. Show all values");
        System.out.println("0. Exit");
        System.out.println("-----------------");
        System.out.print("YOU SELECT: ");
    }

}
