/*Concrete Flyweight
* Shared object with type and texture*/
public class ConcreteTree implements TreeFlyWeight {
    private String type;
    private String texture;
    private String color;

    public ConcreteTree(String type, String texture, String color) {
        this.type = type;
        this.texture = texture;
        this.color = color;
    }

    @Override
    public void render(int x, int y, double size) {
        System.out.println("Rendering a " + type + " tree at (" + x + ", " + y + ") with size " + size + ", texture: " + texture + ", color: " + color);
    }

}
