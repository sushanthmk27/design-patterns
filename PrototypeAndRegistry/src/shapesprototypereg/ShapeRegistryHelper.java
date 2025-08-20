package shapesprototypereg;

public class ShapeRegistryHelper {

    public void shapeRegistryTestGet() {
        Shape shape1 = registry.getShape("Green circle-1");
        Shape shape2 = registry.getShape("Red rectangle-1");
        Shape shape3 = registry.getShape("Green circle-1");
    }

    ShapeRegistry registry = new ShapeRegistry();


    //We can further perform any operations required here
}
