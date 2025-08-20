//This interface can be implemented by the classes to create a deep copy of the class
public interface Prototype<T> {
    T copy();
}
