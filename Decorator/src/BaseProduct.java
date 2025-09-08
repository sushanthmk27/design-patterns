public class BaseProduct implements Product{

    @Override
    public double getCost() {
        return 99.99;
    }

    @Override
    public String getDescription() {
        return "Base Product ";
    }
}
