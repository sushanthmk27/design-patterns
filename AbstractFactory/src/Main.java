public class Main {
    public static void main(String[] args) {

        VehicleFactory vehicleFactory1 = new ElectricFactory();
        Showroom showroom1 = new Showroom(vehicleFactory1);
        System.out.println("Showcase ELECTRIC vehicle skill");
        showroom1.showDriveAndRidingSkills();

        System.out.println();

        VehicleFactory vehicleFactory2 = new PetrolFactory();
        Showroom showroom2 = new Showroom(vehicleFactory2);
        System.out.println("Showcase PETROL vehicle skill");
        showroom2.showDriveAndRidingSkills();
    }
}
