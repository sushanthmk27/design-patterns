public class Client {
    public static void main(String[] args) {
        Product product = new BaseProduct();

        //Gift wrap the product
        product = new GiftWrapDecorator(product);

        //Additional warranty
        product = new WarrantyDecorator(product);

        //Express shipping
        product = new ExpressShippingDecorator(product);

        System.out.println("Product description - "+product.getDescription());
        System.out.println("Total cost - "+product.getCost());
    }
}
