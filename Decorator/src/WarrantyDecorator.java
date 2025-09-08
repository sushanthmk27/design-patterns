public class WarrantyDecorator extends ProductDecorator {

    public WarrantyDecorator(Product product) {
        super(product);
    }

    @Override
    public double getCost() {
        return super.getCost() * 1.25;
    }

    public String getDescription(){
        return super.getDescription() + "Additional warranty added ";
    }
}
