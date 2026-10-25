package org.example;

import org.example.model.Aircraft;
import org.example.model.CargoAircraft;
import org.example.model.MilitaryAircraft;
import org.example.model.PassengerAircraft;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Главное приложение для демонстрации системы учёта самолётов.
 */
public class Main {

    /** Список всех самолётов в аэропорту */
    private static List<Aircraft> airport = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("=== Система учёта самолётов в аэропорту ===\n");

        // Создание 3+ экземпляров самолётов (минимум 3, как требуется)
        airport.add(new PassengerAircraft("SU-101", 150, 5000, 200));
        airport.add(new PassengerAircraft("SU-102", 80, 3000, 180));
        airport.add(new PassengerAircraft("AFL-205", 120, 4000, 190));

        airport.add(new CargoAircraft("CG-501", 5, 8000, 15000));
        airport.add(new CargoAircraft("CG-502", 4, 6000, 10000));

        airport.add(new MilitaryAircraft("MIL-001", 2, 4000, 8, 2500));
        airport.add(new MilitaryAircraft("MIL-002", 3, 5000, 12, 3000));

        // 4. Рассчитать расход топлива для каждого
        System.out.println("--- Расчёт расхода топлива ---");
        for (Aircraft aircraft : airport) {
            System.out.println(aircraft);
        }

        Scanner scanner = new Scanner(System.in);

        // 5. Вывести самолёты с пассажирами меньше заданного
        System.out.print("\nВведите максимальное количество пассажиров: ");
        int maxPassengers = scanner.nextInt();
        scanner.nextLine(); // очистка буфера

        System.out.println("\n--- Самолёты с пассажирами < " + maxPassengers + " ---");
        boolean found = false;
        for (Aircraft aircraft : airport) {
            if (aircraft.getPassengerCount() < maxPassengers) {
                System.out.println(aircraft);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Самолёты не найдены.");
        }

        // 6. Вывести самолёты, название которых начинается с заданной буквы
        System.out.print("\nВведите букву для поиска по названию рейса: ");
        char letter = scanner.nextLine().charAt(0);

        System.out.println("\n--- Самолёты, название которых начинается с '" +
                Character.toUpperCase(letter) + "' ---");
        found = false;
        for (Aircraft aircraft : airport) {
            if (aircraft.getFlightName().toUpperCase().startsWith(
                    String.valueOf(Character.toUpperCase(letter)))) {
                System.out.println(aircraft);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Самолёты не найдены.");
        }

        scanner.close();
        System.out.println("\nПрограмма завершена.");
    }
}