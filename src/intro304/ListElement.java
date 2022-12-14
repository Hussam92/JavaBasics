package intro304;

public class ListElement<T> {

    private T data;
    private ListElement<T> next;

    public ListElement(T data) {
        this.data = data;   
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ListElement<T> getNext() {
        return next;
    }
    
    public void setNext(ListElement<T> next) {
        this.next = next;
    }
}
