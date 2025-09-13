import java.util.ArrayList;
import java.util.List;

public class ForestAsClient {
    private List<TreeInstance> treeInstances = new ArrayList<>();
    private TreeFactory treeFactory = new TreeFactory();

    public void plantTree(String type, String texture, String color, int x, int y, double size) {
        TreeFlyWeight treeFlyweight = treeFactory.getTree(type, texture, color);
        treeInstances.add(new TreeInstance(treeFlyweight, x, y, size));
    }

    public void renderForest(){
        for(TreeInstance treeInstance : treeInstances){
            treeInstance.render();
        }
    }

    public static void main(String[] args){
        ForestAsClient forest = new ForestAsClient();
        forest.plantTree("Pine", "Rough", "Green", 10, 20, 5.5);
        forest.plantTree("Oak", "Smooth", "Brown", 15, 25, 6.0);
        forest.plantTree("Pine", "Rough", "Green", 30, 40, 7.5); // Reuses the existing Pine tree flyweight
        forest.renderForest();
    }
}
