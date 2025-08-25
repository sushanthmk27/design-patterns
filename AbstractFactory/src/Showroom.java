public class Showroom {

    private Car car;
    private Bike bike;

    public Showroom(VehicleFactory vehicleFactory) {
        this.car = vehicleFactory.createCar();
        this.bike = vehicleFactory.createBike();
    }

    public void showDriveAndRidingSkills(){
        car.drive();
        bike.ride();
    }
}
