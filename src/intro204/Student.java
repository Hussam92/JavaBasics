package intro204;

import java.util.List;

import intro202.Grade;
import intro202.Course;

public class Student extends User {

    private Grade grade;

    public Student(String name, String email, String password) {
        super(name, email, password);
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
    
    public List<Course> getCourses() {
        return grade.getCourses();
    }    
}
