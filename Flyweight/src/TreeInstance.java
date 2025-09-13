
/*Extrinsic state holder*/
public class TreeInstance {
    private TreeFlyWeight treeFlyWeight;
    private int x;
    private int y;
    private double size;

    public TreeInstance(TreeFlyWeight treeFlyWeight, int x, int y, double size) {
        this.treeFlyWeight = treeFlyWeight;
        this.x = x;
        this.y = y;
        this.size = size;
    }

    public void render(){
        treeFlyWeight.render(x, y, size); //here we are passing the extrinsic state to the flyweight instance to render
    }
}
