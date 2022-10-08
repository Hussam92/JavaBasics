package intro203;

public class MyStack<T> implements MyList<T> {
    
    private ListElement<T> top;
    private int size;
    
    public MyStack() {
        size = 0;
    }


    public T get(int index) {
        ListElement<T> current = top;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getData();
    }

    public T remove(int index) {
        if (index == 0) {
            ListElement<T> oldTop = top;
            top = top.getNext();
            size--;
            return oldTop.getData();
        } else {
            ListElement<T> current = top;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            ListElement<T> oldNext = current.getNext();
            current.setNext(oldNext.getNext());
            size--;
            return oldNext.getData();
        }
    }

    public int size() {
        return size;
    }


    @Override
    public void add(T t) {
        ListElement<T> newElement = new ListElement<T>(t);
        newElement.setNext(top);
        top = newElement;
        size++;
    }


    @Override
    public void add(int index, T t) {
        if (index == 0) {
            add(t);
        } else {
            ListElement<T> current = top;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            ListElement<T> newElement = new ListElement<T>(t);
            newElement.setNext(current.getNext());
            current.setNext(newElement);
            size++;
        } 
    }
}
