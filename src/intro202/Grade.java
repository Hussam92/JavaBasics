package intro202;

import java.util.*;

public class Grade {
    
    private int level;
    private String name;
    private School school;

    private List<Course> courses = new ArrayList<>();

    public Grade(School school, int level, String name) {
        this.school = school;
        this.level = level;
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    public School getSchool() {
        return school;
    }

    public List<Course> getCourses() {
        return courses;
    }
}
