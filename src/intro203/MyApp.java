package intro203;

public class MyApp {
    
    public static void main(String[] args) {
        MyList<Integer> myStack = new MyStack<>();
        myStack.add(10);
        myStack.add(20);
        myStack.add(30);

        for (int i = 0; i < myStack.size(); i++) {
            System.out.println(myStack.get(i));
        }

        MyList<Double> myQueue = new MyQueue<>();
        myQueue.add(10.0);
        myQueue.add(20.0);
        myQueue.add(30.0);

        for (int i = 0; i < myQueue.size(); i++) {
            System.out.println(myQueue.get(i));
        }        

        MyList<String> myShapeList = new MyStack<>();
        myShapeList.add("Circle");
        myShapeList.add("Square");
        myShapeList.add("Triangle");
        
        for (int i = 0; i < myShapeList.size(); i++) {
            System.out.println(myShapeList.get(i));
        }

    }
}
