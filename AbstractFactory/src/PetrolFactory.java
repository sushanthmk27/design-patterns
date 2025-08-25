public class PetrolFactory implements VehicleFactory{

    @Override
    public Bike createBike() {
        return new PetrolBike();
    }

    @Override
    public Car createCar() {
        return new PetrolCar();
    }
}
