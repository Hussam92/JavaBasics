package intro104;

/**
 * Arrays are a special type of variable that can store multiple values
 * Arrays are used to store multiple values in a single variable
 * Arrays can only store values of the same type
 * Arrays are indexed starting at 0
 */
public class ArrayWorker {
    
    public static void main(String[] args) {
        
        int[] myNumberArray = new int[]{1, 2, 3, 4, 5};
        String[] myStringArray = new String[5];
        double[] myDoubleArray = {5.0, 4.5, 4.3, 4.2, 4.0};


        // The numberArray has 5 elements in it. Each being an integer and each being already initialized
        // The stringArray has 5 elements in it. Each being a string and each being initialized to null
        // You can initialize an array with values like this:
        // int[] myNumberArray = new int[]{1, 2, 3, 4, 5};
        // You can also initialize an array with values like this:
        // double[] = {5.0, 4.5, 4.3, 4.2, 4.0};
        // You can also initialize an array without values like this:
        // String[] myStringArray = new String[5];

        // You can access the elements of an array using the index of the element 
        // The index of an array starts at 0
        System.out.println("The first element of myNumberArray is " + myNumberArray[0]);
        System.out.println("The second element of myNumberArray is " + myNumberArray[1]);
        System.out.println("The third element of myNumberArray is " + myNumberArray[2]);
        System.out.println("The fourth element of myNumberArray is " + myNumberArray[3]);
        System.out.println("The fifth element of myNumberArray is " + myNumberArray[4]);

        System.out.println("The first element of myStringArray is " + myStringArray[0]);
        System.out.println("The second element of myStringArray is " + myStringArray[1]);
        System.out.println("The third element of myStringArray is " + myStringArray[2]);
        System.out.println("The fourth element of myStringArray is " + myStringArray[3]);
        System.out.println("The fifth element of myStringArray is " + myStringArray[4]);

        System.out.println("The first element of myDoubleArray is " + myDoubleArray[0]);
        System.out.println("The second element of myDoubleArray is " + myDoubleArray[1]);
        System.out.println("The third element of myDoubleArray is " + myDoubleArray[2]);
        System.out.println("The fourth element of myDoubleArray is " + myDoubleArray[3]);
        System.out.println("The fifth element of myDoubleArray is " + myDoubleArray[4]);

        // You can change the value of an element in an array
        System.out.println("Let's manipulate our arrays");
        myNumberArray[0] = 10;
        myNumberArray[1] = -6;
        myNumberArray[2] = 99999;
        System.out.println("The first element of myNumberArray is " + myNumberArray[0]);
        System.out.println("The second element of myNumberArray is " + myNumberArray[1]);
        System.out.println("The third element of myNumberArray is " + myNumberArray[2]);
        System.out.println("The fourth element of myNumberArray is " + myNumberArray[3]);
        System.out.println("The fifth element of myNumberArray is " + myNumberArray[4]);

        // You can not access an element that is out of bounds because it does not exist
        // An array's length is fixed once the array is created and cannot be changed
        // Arrays never have negative indexes

        // You can access the length of an array using the length property
        System.out.println("The length of myNumberArray is " + myNumberArray.length);
        System.out.println("The length of myStringArray is " + myStringArray.length);
        System.out.println("The length of myDoubleArray is " + myDoubleArray.length);

        // When you print an arrray it will print the memory address of the array
        System.out.println("The memory address of myNumberArray is " + myNumberArray);

        // You can use the java.utils.Arrays wrapper class to achieve more functionality with arrays
        // But this is out of this course's scope
    }
}
