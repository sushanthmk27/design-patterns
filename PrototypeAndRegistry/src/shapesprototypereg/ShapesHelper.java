package shapesprototypereg;

import java.util.ArrayList;
import java.util.List;

public class ShapesHelper {

    public static void createShapes() {
        List<Shape> shapeList = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
/*        circle.setX(30);
        circle.setY(40);*/
        circle.setColor("Blue");
        circle.radius = 15;
        shapeList.add(circle);

        Circle clonedCircle = (Circle) circle.copy();
        shapesCopy.add(clonedCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.setX(10);
        rectangle.setY(20);
        rectangle.setColor("Red");
        shapeList.add(rectangle);

//        Rectangle clonedRectangle = (Rectangle) rectangle.copy();
//        shapesCopy.add(clonedRectangle);

        System.out.println("Original Circle: "+"Circle color: "+ circle.getColor() + ", Radius: " + circle.radius);
        System.out.println("Cloned Circle: " +"Cloned Circle color: " + clonedCircle.getColor()+ ", Cloned Circle Radius: " + clonedCircle.radius);

        System.out.println("Original Rectangle: " + "Rectangle length: "+rectangle.getX() + ", " + "Rectangle breadth :"+ rectangle.getY() + ", " + "Rectangle color: "+rectangle.getColor());
        //System.out.println("Cloned Rectangle: " + "Cloned Rectangle length: "+clonedRectangle.getX() + ", " + "Cloned Rectangle breadth: "+clonedRectangle.getY() + ", " + "Cloned Rectangle color: "+clonedRectangle.getColor());

        cloneAndCompare(shapeList, shapesCopy);
    }


    public static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        for(Shape shape : shapes){
            shapesCopy.add(shape);
        }

        for(int i=0; i<shapes.size(); i++){
            if(shapes.get(i) != shapesCopy.get(i)){
                System.out.println(i+ " Shapes are different objects - 48");  // Says they are instances of different objects confirming clone successful
                if(shapes.get(i).equals(shapesCopy.get(i))){
                    System.out.println(i+ " Shapes are the same - 50");
                }
                else{
                    System.out.println(i+ " Shapes are not the same - 53");
                }
            }
            else{
                System.out.println(i+ " Shape obj are the same - 57");
            }
        }
    }

}
