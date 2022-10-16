package intro202;

// Now we will learn about relations between classes
// We will learn about composition, and aggregation
// Compositoin is a relationship between two classes where one class is a part of the other
// Aggregation is a relationship between two classes where one class is a part of the other, but the other class can exist without the first class
// We will also learn about inheritance, which is a relationship between two classes where one class is a special case of the other
// We will also learn about polymorphism, which is the ability to treat objects of different types in the same way
// We will also learn about interfaces, which are a way of defining a contract of a class

public class School {
    
    private String name;
    private String address;
    private String city;
    private String state;

    public School(String name, String address, String city, String state) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }
}
