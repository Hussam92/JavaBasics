package intro204;

import java.util.ArrayList;
import java.util.List;

import intro202.*;

public class Teacher extends Employee {

    private List<Course> courses = new ArrayList<>();

    public Teacher(School school, String name, String email, String password) {
        super(name, email, password);
        super.setSchool(school);
    }
    
    public List<Course> getCourses() {
        return courses;
    }
}
