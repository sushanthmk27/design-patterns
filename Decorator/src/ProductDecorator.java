public abstract class ProductDecorator implements Product {
    protected Product product;

    public ProductDecorator(Product product) {
        this.product = product;
    }

    public double getCost(){
        return product.getCost();
    }

    public String getDescription(){
        return product.getDescription();
    }
}
