package ru.stqa.pft.sandbox;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Площадь прямоугольника:" + rectangle.area());

        Square square = new Square(5);
        System.out.println("Площадь квадрата:" + square.area());
    }
}