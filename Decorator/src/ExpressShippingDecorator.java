public class ExpressShippingDecorator extends ProductDecorator {

    public ExpressShippingDecorator(Product product) {
        super(product);
    }

    @Override
    public double getCost() {
        return super.getCost() * 1.15; //15% increase for express shipping
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Express Shipping added, ";
    }

}
