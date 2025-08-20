package shapesprototypereg;

import java.util.HashMap;
import java.util.Map;

public class ShapeRegistry {

    private Map<String, Shape> shapeHashMap = new HashMap<String, Shape>();

    public void addShapes(String key, Shape shape) {
        if (shape != null) {
            shapeHashMap.put(key, shape);
        }
    }

    public void removeShapes(String key) {
        shapeHashMap.remove(key);
    }

    public Shape getShape(String key) {
        Shape shape = shapeHashMap.get(key);
        if (shape != null) {
            return shape.copy();
        }
        return null;
    }


    public void fillShapes(){
        Circle circle = new Circle();
        circle.setX(30);
        circle.setY(40);
        circle.setColor("Blue");
        circle.radius = 15;

        Rectangle rectangle = new Rectangle();
        rectangle.setX(10);
        rectangle.setY(20);
        rectangle.setColor("Red");

        shapeHashMap.put("Green circle-1", circle);
        shapeHashMap.put("Red rectangle-1", rectangle);
    }

}
