package org.example;

import geometry2d.*;
import geometry3d.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Задание 1
        Button button = new Button();
        button.click();
        button.click();
        System.out.println();

        // Задание 2
        Balance balance = new Balance();
        balance.addLeft(1);
        balance.addRight(1);
        balance.result();
        balance.addRight(2);
        balance.result();
        System.out.println();

        // Задание 3
        Bell bell = new Bell();
        bell.sound();
        System.out.println();

        // Задание 4
        OddEvenSeparator oddEvenSeparator = new OddEvenSeparator();
        oddEvenSeparator.addNumber(5);
        oddEvenSeparator.addNumber(2);
        oddEvenSeparator.addNumber(7);
        oddEvenSeparator.odd();
        oddEvenSeparator.even();
        System.out.println();

        // Задание 5
        Table table = new Table(6, 6);
        System.out.println("Строк: " + table.rows());
        System.out.println("Колонн: " + table.cols());
        table.setValue(2, 2, 5);
        table.setValue(3, 3, 5);
        System.out.println(table);
        System.out.println("Среднее: " + table.average());
        System.out.println();

        // Задание 6
        Figure circle = new Circle(2);
        System.out.println(circle);
        System.out.println();

        Figure rectangle = new Rectangle(2, 2);
        System.out.println(rectangle);
        System.out.println();

        Cylinder cylinder = new Cylinder(circle, 5);
        System.out.println(cylinder);
        System.out.println();
    }
}


class Button {

    private int clickCount;

    public void click() {
        clickCount++;
        System.out.println(clickCount);
    }
}

class Balance {

    private int rightBowl = 0;
    private int leftBowl = 0;

    public void addRight(int n) {
        this.rightBowl += n;
    }

    public void addLeft(int n) {
        this.leftBowl += n;
    }

    public void result() {
        if (this.rightBowl == this.leftBowl) {
            System.out.println("=");
        }
        else if (this.rightBowl > this.leftBowl) {
            System.out.println("R");
        }
        else {
            System.out.println("L");
        }
    }
}

class Bell {

    public void sound(){
        System.out.println("ding");
        System.out.println("dong");
    }
}

class OddEvenSeparator {

    private final List<Integer> oddList = new ArrayList<>();
    private final List<Integer> evenList = new ArrayList<>();

    public void addNumber(int n) {
        if (n % 2 == 0) {
            oddList.add(n);
        }
        else {
            evenList.add(n);
        }
    }

    public void odd() {
        System.out.println(oddList);
    }

    public void even() {
        System.out.println(evenList);
    }
}

class Table {

    private static int[][] array;

    Table(int row, int col) {
        array = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = 0;
            }
        }
    }

    public void getValue(int row, int col) {
        System.out.println(array[row][col]);
    }

    public static void setValue(int row, int col, int value) {
        array[row][col] = value;
    }

    public int rows() {
        return array.length;
    }

    public int cols() {
        return array[0].length;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                str.append(array[i][j]).append(" ");
            }
            str.append("\n");
        }
        return str.toString();
    }

    public double average() {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                sum += array[i][j];
            }
        }
        return sum / (array.length * array[0].length);
    }
}

