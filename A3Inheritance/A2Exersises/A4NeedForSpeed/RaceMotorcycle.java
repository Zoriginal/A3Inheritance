package A3Inheritance.A2Exersises.A4NeedForSpeed;

public class RaceMotorcycle extends Motorcycle{
    private final static double DEFAULT_FUEL_CONSUMPTION = 8;

    public RaceMotorcycle(double fuel, int horsePower) {
        super(fuel, horsePower);
        this.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}
