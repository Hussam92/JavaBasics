package intro106;

public class MethodsBasics {

    // Methods are defined in Java classes with the following syntax:
    // <access modifier> <return type> <method name> (<parameter list>) {
    //     <method body>
    // }
    // The access modifier determines who can access the method
    // The return type determines what type of data the method returns
    // The method name is the name of the method
    // The parameter list is a list of parameters that the method takes in
    // The method body, the code between the curly brackets, is the code that the method executes
    // Static means that the method is static and can be called without creating an instance of the class
    // Instances of classes is part of Object oriented programming
    // We will cover this later
    public static void main(String[] args) {
        System.out.println("Hello World");
        int randomNumber = (int) (Math.random() * 100);
        System.out.println("Random number: " + randomNumber);

        printSomething();
        printSomething();

        if (randomNumber > 50) {
            printSomething();
            System.out.println("Random number is greater than 50");
        } else {
            System.out.println("Random number is less than 50");
        }

        printSomething();
        printThisInAllLower("Abudi Itani");
        System.out.println(giveMeMyStringInAllCaps("Abudi Itani"));
        printThisInReverse("Abudi Itani");
        printThisInReverse(giveMeMyStringInAllCaps("Hussam Itani"));
        //printThisInReverse(printThisInAllLower("Abudi Itani"));
        System.out.println(duplicateString("Abudi"));
        System.out.println(duplicateString(duplicateString("Kaussar")));
        System.out.println(duplicateString(giveMeMyStringInAllCaps(duplicateString("Iman"))));
        System.out.println("\n --------");
        String result = duplicateString(giveMeMyStringInAllCaps(duplicateString("Iman")));
        printThisInAllLower(result);
    }

    /**
     * This method prints something
     */
    public static void printSomething() {
        System.out.println("This is bening printed because you called printSomething");
    }

    /**
     * This method prints a given string in all caps
     */
    public static void printThisInAllLower(String mystring) {
        System.out.println("This method will print mystring in all lower case");
        System.out.println(mystring.toLowerCase());
    }

    /**
     * This method prints a given string in reverse
     */
    public static void printThisInReverse(String mystring){
        System.out.println("[Log] :: Computer is about to print in reverse " + mystring);
        char[] stringToCharArray = mystring.toCharArray();
        // "Abudi" -> ['A', 'b', 'u', 'd', 'i']
        // ['A'=>0, 'b'=>1, 'u'=>2, 'd'=>3, 'i'=>4]

        for (int i = stringToCharArray.length - 1; i >= 0; i--) {
            System.out.print(stringToCharArray[i]);
        }
        
        System.out.println("\n This is the string in reverse.");
    }

    /**
     * This method returns a given string in all caps
     * It does not print anything in the console
     */
    public static String giveMeMyStringInAllCaps(String mystring){
        System.out.println("[Log] :: Computer is about to make " + mystring + " all caps");
        String myAllCapsString = mystring.toUpperCase();
        return myAllCapsString;
    }

    /**
     * This method duplicates the given string and returns it
     */
    public static String duplicateString(String myString){
        System.out.println("[Log] :: Computer is about to duplicate " + myString);
        return myString + " " + myString;
    }



}
