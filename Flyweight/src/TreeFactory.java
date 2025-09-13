import java.util.HashMap;
import java.util.Map;

/*Flyweight Factory class
* used to manage shared classes*/
public class TreeFactory {
    private Map<String, ConcreteTree> cacheFactory = new HashMap<>();

    public TreeFlyWeight getTree(String type, String texture, String color) {
        String hMapKey = type + "-" + texture + "-" + color;
/*        if(cacheFactory.containsKey(hMapKey)){
            return cacheFactory.get(hMapKey);
        } else {
            ConcreteTree newTree = new ConcreteTree(type, texture, color);
            cacheFactory.put(hMapKey, newTree);
            return newTree;
    }*/
        cacheFactory.putIfAbsent(hMapKey, new ConcreteTree(type, texture, color));
        return cacheFactory.get(hMapKey);
    }
}
