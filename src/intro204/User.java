package intro204;

import intro202.School;

/**
 * In this example we will see how to create a class that extends another class
 * This is called inheritance
 * Inheritance is when the class inher (takes) all the properties and methods of another class
 * 
 * 
 * Every class can be extended except if it is a final class
 */
abstract class User {
    
    private String name;
    private String email;
    private String password;
    private School school;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
