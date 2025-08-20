package shapesprototypereg;

import java.util.Objects;

public class Rectangle extends Shape{
    int width;
    int height;

    public Rectangle(){}

    public Rectangle(Rectangle rectangle){
        if(rectangle != null){
            this.width = rectangle.width;
            this.height = rectangle.height;
        }
    }

    @Override
    public Shape copy(){
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return width == rectangle.width && height == rectangle.height;
    }

}
