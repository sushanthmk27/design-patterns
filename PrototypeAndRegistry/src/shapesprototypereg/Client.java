package shapesprototypereg;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        ShapesHelper shapesHelper = new ShapesHelper();
        ShapeRegistryHelper shapeRegistryHelper = new ShapeRegistryHelper();

        shapesHelper.createShapes();
        shapeRegistryHelper.shapeRegistryTestGet();
    }


}
