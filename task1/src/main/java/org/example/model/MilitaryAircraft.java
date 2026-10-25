package org.example.model;

/**
 * Класс военного самолёта.
 */
public class MilitaryAircraft extends Aircraft {

    private int weaponCount;
    private int maxSpeed;

    /**
     * @param flightName позывной
     * @param passengerCount количество членов экипажа
     * @param fuelAmount количество топлива
     * @param weaponCount количество вооружения
     * @param maxSpeed максимальная скорость
     */
    public MilitaryAircraft(String flightName, int passengerCount, double fuelAmount,
                            int weaponCount, int maxSpeed) {
        super(flightName, passengerCount, fuelAmount);
        this.weaponCount = weaponCount;
        this.maxSpeed = maxSpeed;
    }

    /**
     * Расход: 60 л/100км + 2 л на каждую единицу вооружения.
     */
    @Override
    public double calculateFuelConsumption() {
        return 60.0 + (weaponCount * 2.0);
    }

    public int getWeaponCount() { return weaponCount; }
    public void setWeaponCount(int weaponCount) { this.weaponCount = weaponCount; }

    public int getMaxSpeed() { return maxSpeed; }
    public void setMaxSpeed(int maxSpeed) { this.maxSpeed = maxSpeed; }
}