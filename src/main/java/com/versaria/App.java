package com.versaria;

public class App {
    public static void main(String[] args) {
        // Задача 1
        double time = 0;
        System.out.println("Инициализация времени: " + time);

        // Задача 2
        double distance = 80;
        final double SPEED = 40;
        time = distance / SPEED;
        System.out.println("\nРасчёт времени поездки:");
        System.out.println("Скорость: " + SPEED + " км/ч");
        System.out.println("Расстояние: " + distance + " км");
        System.out.println("Время поездки: " + time + " часа");

        // Задача 3
        time = distance / SPEED * 60;
        System.out.println("\nПеревод в минуты:");
        System.out.println("Время поездки: " + time + " минут");

        // Задача 4
        System.out.println("\nСтарт поездки!");
        System.out.println("Осталось минут: " + time);
    }
}