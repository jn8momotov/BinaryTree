package ru.momotov;

public class BinaryTree {

    private Node root;

    // Конструктор, создающий пустое дерево
    public BinaryTree() {
        root = null;
    }

    public void add(String value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return;
        }
        Node currentNode = root;
        Node parentNode;
        while (currentNode != null) {
            parentNode = currentNode;
            int resultOfCompare = value.compareTo(currentNode.getValue());
            if (resultOfCompare < 0) {
                currentNode = currentNode.getLeft();
                if (currentNode == null) {
                    parentNode.setLeft(newNode);
                    return;
                }
            } else {
                currentNode = currentNode.getRight();
                if (currentNode == null) {
                    parentNode.setRight(newNode);
                    return;
                }
            }
        }
    }

    public String max() {
        if (root == null) {
            return null;
        }
        Node currentNode = root;
        String maxValue = "";
        while (currentNode != null) {
            maxValue = currentNode.getValue();
            currentNode = currentNode.getRight();
        }
        return maxValue;
    }

    public void print() {
        if (root == null) {
            System.out.println("Binary three is empty!");
            return;
        }
        print(root);
    }

    private void print(Node parent) {
        if (parent != null) {
            print(parent.getRight());
            System.out.println("Value: " + parent.getValue());
            print(parent.getLeft());
        }
    }

}
