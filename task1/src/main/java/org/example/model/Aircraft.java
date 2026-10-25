package org.example.model;

/**
 * Абстрактный класс самолёта.
 * Содержит общие поля для всех типов воздушных судов.
 */
public abstract class Aircraft {

    /** Название рейса */
    private String flightName;

    /** Количество пассажиров */
    private int passengerCount;

    /** Количество топлива в литрах */
    private double fuelAmount;

    /**
     * Конструктор самолёта.
     * @param flightName название рейса
     * @param passengerCount количество пассажиров
     * @param fuelAmount количество топлива
     */
    public Aircraft(String flightName, int passengerCount, double fuelAmount) {
        this.flightName = flightName;
        this.passengerCount = passengerCount;
        this.fuelAmount = fuelAmount;
    }

    /**
     * Абстрактный метод расчёта расхода топлива.
     * @return расход топлива л/100км
     */
    public abstract double calculateFuelConsumption();

    public String getFlightName() { return flightName; }
    public void setFlightName(String flightName) { this.flightName = flightName; }

    public int getPassengerCount() { return passengerCount; }
    public void setPassengerCount(int passengerCount) { this.passengerCount = passengerCount; }

    public double getFuelAmount() { return fuelAmount; }
    public void setFuelAmount(double fuelAmount) { this.fuelAmount = fuelAmount; }

    @Override
    public String toString() {
        return String.format("%s [Рейс: %s, Пассажиры: %d, Топливо: %.1f л, Расход: %.2f л/100км]",
                getClass().getSimpleName(), flightName, passengerCount, fuelAmount, calculateFuelConsumption());
    }
}