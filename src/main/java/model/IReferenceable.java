package model;


public interface IReferenceable<T> {
    boolean hasReferencedObject();

    T findReferencedObject(Components components);

    T getReferencedObject();
}
