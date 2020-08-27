package model;

public class Reference<T extends ReferenceableObject<T>> implements IReferenceable<T> {
    private String ref;

    private T referencedObject;

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public boolean hasReferencedObject() {
        return referencedObject != null;
    }

    public T findReferencedObject(Components components) {
        return null;
    }

    public T getReferencedObject() {
        return referencedObject;
    }
}
