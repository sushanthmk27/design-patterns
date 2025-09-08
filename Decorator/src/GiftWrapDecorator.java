public class GiftWrapDecorator extends ProductDecorator {

    public GiftWrapDecorator(Product product) {
        super(product);
    }

    @Override
    public double getCost() {
        return super.getCost() * 1.10; //10% increase for gift wrapping
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Gift Wrapped the item, ";
    }
}
