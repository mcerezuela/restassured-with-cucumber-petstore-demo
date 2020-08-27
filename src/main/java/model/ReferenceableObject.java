package model;

public class ReferenceableObject<T extends ReferenceableObject<T>> implements IReferenceable<T> {
    public boolean hasReferencedObject() {
        return true;
    }

    public T findReferencedObject(Components components) {
        return (T) this;
    }

    public T getReferencedObject() {
        return (T) this;
    }
}
