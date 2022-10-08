package intro203;

public class MyQueue<T> implements MyList<T> {

    private ListElement<T> first;
    private ListElement<T> last;
    private int size;

    public MyQueue() {
        size = 0;
    }

    @Override
    public void add(T t) {
        ListElement<T> newElement = new ListElement<T>(t);
        if (size == 0) {
            first = newElement;
            last = newElement;
        } else {
            last.setNext(newElement);
            last = newElement;
        }
        size++;
    }

    @Override
    public void add(int index, T t) {
        if (index == 0) {
            add(t);
        } else {
            ListElement<T> current = first;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            ListElement<T> newElement = new ListElement<T>(t);
            newElement.setNext(current.getNext());
            current.setNext(newElement);
            size++;
        }
    }

    @Override
    public T get(int index) {
        ListElement<T> current = first;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getData();
    }

    @Override
    public T remove(int index) {
        if (index == 0) {
            ListElement<T> oldFirst = first;
            first = first.getNext();
            size--;
            return oldFirst.getData();
        } else {
            ListElement<T> current = first;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            ListElement<T> oldNext = current.getNext();
            current.setNext(oldNext.getNext());
            size--;
            return oldNext.getData();
        }
    }

    @Override
    public int size() {
        return size;
    }
}
