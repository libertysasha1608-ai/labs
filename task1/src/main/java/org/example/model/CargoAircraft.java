package org.example.model;

/**
 * Класс грузового самолёта.
 */
public class CargoAircraft extends Aircraft {

    private double cargoWeight;

    /**
     * @param flightName название рейса
     * @param passengerCount количество членов экипажа
     * @param fuelAmount количество топлива
     * @param cargoWeight вес груза в кг
     */
    public CargoAircraft(String flightName, int passengerCount, double fuelAmount, double cargoWeight) {
        super(flightName, passengerCount, fuelAmount);
        this.cargoWeight = cargoWeight;
    }

    /**
     * Расход: 40 л/100км + 0.1 л на каждый кг груза.
     */
    @Override
    public double calculateFuelConsumption() {
        return 40.0 + (cargoWeight * 0.1);
    }

    public double getCargoWeight() { return cargoWeight; }
    public void setCargoWeight(double cargoWeight) { this.cargoWeight = cargoWeight; }
}