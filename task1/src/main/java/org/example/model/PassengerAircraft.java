package org.example.model;

/**
 * Класс пассажирского самолёта.
 */
public class PassengerAircraft extends Aircraft {

    private int maxCapacity;

    /**
     * @param flightName название рейса
     * @param passengerCount количество пассажиров
     * @param fuelAmount количество топлива
     * @param maxCapacity максимальная вместимость
     */
    public PassengerAircraft(String flightName, int passengerCount, double fuelAmount, int maxCapacity) {
        super(flightName, passengerCount, fuelAmount);
        this.maxCapacity = maxCapacity;
    }

    /**
     * Расход: 25 л/100км + 0.5 л на каждого пассажира.
     */
    @Override
    public double calculateFuelConsumption() {
        return 25.0 + (getPassengerCount() * 0.5);
    }

    public int getMaxCapacity() { return maxCapacity; }
    public void setMaxCapacity(int maxCapacity) { this.maxCapacity = maxCapacity; }
}