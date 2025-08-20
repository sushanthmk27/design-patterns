package shapesprototypereg;

import java.util.Objects;

public class Circle extends Shape{
    public int radius;

    public Circle(){}

    public Circle(Circle circle) {
        super(circle);
        if(circle != null){
            this.radius = circle.radius;
        }
    }

    @Override
    public Shape copy(){
        return new Circle(this);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Circle circle)) return false;
        return radius == circle.radius;
    }

}
