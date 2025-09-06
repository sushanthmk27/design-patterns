/*Facade class which interacts with multiple subsystem class
* Rather than client interacting with all the subsystem class, client will only interact with Facade and Facade class will interact with rest of the downstream class*/
public class HomeAutomation {
    private LightSystem lightSystem;
    private AirConditioningUnit acUnit;
    private SecuritySystem securitySystem;

    public HomeAutomation(){
        this.lightSystem = new LightSystem();
        this.acUnit = new AirConditioningUnit();
        this.securitySystem = new SecuritySystem();
    }

    public void activate(){
        System.out.println("Activating Home Automation System...");
        lightSystem.switchOn();
        acUnit.turnOn();
        securitySystem.arm();
        System.out.println("Home Automation System activated.");
    }

    public void deactivate(){
        System.out.println("Deactivating Home Automation System...");
        lightSystem.switchOff();
        acUnit.turnOff();
        securitySystem.disarm();
        System.out.println("Home Automation System deactivated.");
    }
}
