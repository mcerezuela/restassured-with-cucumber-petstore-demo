package model;

public class Reference<T> implements IReferenceable<T> {
    private String ref;

    private T referencedObject;

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    private void findReferencedObject() {

    }

    public T getReferencedObject() {
        return referencedObject;
    }
}
